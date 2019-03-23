package com.wakandaforever.wakandaforever.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class DataDto {
	
	private Long id;
	private Float humidity;
	private Float temperature;
	private Float waterLevel;
	private Float soilMoisture;
	private Float fire;
	private Float pressure;
	private String createdAt;	
	private Float sound;
	private Float light;
	private Float airQuality;
	

}
