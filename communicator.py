import serial
import requests
import random
import json

API_ENDPOINT = "http://80.240.21.133:7777/"
STREAM_PATH = "/dev/ttyUSB0"
STREAM_PORT = 9600

serial_object = serial.Serial(STREAM_PATH, STREAM_PORT)
serials = {
    "temperature" : None,
    "sound" : None,
    "humidity" : None,
    "fire" : None,
    "light" : None,
    "pressure" : None,
    "soilMoisture" : None,
    "waterLevel" : None,
    "airQuality" : None
}


credentials = {
    "username" : "kate",
    "password" : "kate"
}

token_dict = requests.post(url=API_ENDPOINT + "token/generateToken", json=credentials)
token = json.loads(token_dict.text)['token']

header = {
    "Authorization" : "Bearer " + token
}

def generate_pressure():
    pressure = round(random.uniform(100.0, 102.0), 4)
    return pressure

def extract_data(data, serials):
    index_of_equal = data.find('=')
    key = data[0:index_of_equal]
    value = data[index_of_equal+1:]
    serials[key] = float(value)
    serials["pressure"] = generate_pressure()

def set_default_values(serials):
    for key in serials.keys():
        serials[key] = None

while True:
    data = serial_object.readline()
    data = data.decode("utf-8")
    if data:
        extract_data(data, serials)
    if all(value is not None for value in serials.values()):
        req = requests.post(url=API_ENDPOINT + "data/save", json=serials, headers=header)
        print(req.text)
        set_default_values(serials)