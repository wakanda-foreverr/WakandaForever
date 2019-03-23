import requests
import json
import csv

API_ENDPOINT = "http://80.240.21.133:7777/"

credentials = {
    "username" : "kate",
    "password" : "kate"
}

token_dict = requests.post(url=API_ENDPOINT + "token/generateToken", json=credentials)
token = json.loads(token_dict.text)['token']

header = {
    "Authorization" : "Bearer " + token
}

def add_prediction_values(data):
    for row in data:
        if row["temperature"] < 0.0:
            row["illness"] = "Freezing"
        elif row["humidity"] > 50.0:
            row["illness"] = "Fungi"
        elif row["temperature"] > 31.2 and humidity < 13.0:
            row["illness"] = "Summer Scorch"
        elif row["soilMoisture"] > 84.0:
            row["illness"] = "IronChorasis"
        else:
            row["illness"] = "Normal"

req = requests.get(url=API_ENDPOINT + "data/all", headers=header)
data = json.loads(req.text)
add_prediction_values(data)
keys = data[0].keys()
print(keys)

with open("data.csv", "w") as output_file:
    dict_writer = csv.DictWriter(output_file, keys)
    dict_writer.writeheader()
    dict_writer.writerows(data)

