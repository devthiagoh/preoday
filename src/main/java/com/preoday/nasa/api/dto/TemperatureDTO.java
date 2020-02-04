package com.preoday.nasa.api.dto;

import java.io.Serializable;

public class TemperatureDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Double averageTemperature;

	public Double getAverageTemperature() {
		return averageTemperature;
	}

	public void setAverageTemperature(Double averageTemperature) {
		this.averageTemperature = averageTemperature;
	}	
}
