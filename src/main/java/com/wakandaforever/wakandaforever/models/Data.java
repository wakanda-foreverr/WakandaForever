package com.wakandaforever.wakandaforever.models;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@lombok.Data
@AllArgsConstructor
@NoArgsConstructor
public class Data {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(columnDefinition = "serial", name = "id")
	private Long id;
	
	@NotNull
	private Timestamp createdAt;
	
	@NotNull
	private Timestamp modifiedAt;
	
	@Column(name = "soil_moisture")
	private Float soilMoisture;
	
	@Column(name = "humidity")
	private Float humidity;
	
	@Column(name = "temperature")
	private Float temperature;
	
	@Column(name = "water_level")
	private Float waterLevel;
	
	@Column(name = "fire")
	private Float fire;
	
	@Column(name = "pressure")
	private Float pressure;

	@Column
	private Float sound;
	
	@Column
	private Float light;
	
	@Column(name = "air_quality")
	private Float airQuality;
}
