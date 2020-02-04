package com.preoday.nasa.api.service;

import java.util.Map.Entry;
import java.util.function.Predicate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.preoday.nasa.api.dto.SolsResponseDTO;
import com.preoday.nasa.api.dto.TemperatureDTO;
import com.preoday.nasa.api.dto.sol.SolDTO;

@Component
public class MarsWeatherService {

	@Autowired
	private RestService service;
	
	public TemperatureDTO getAverageTemperature(Integer sol) {
		
		if (sol != null && !sol.equals(0)) {			
			return getSolTemperature(sol);			
		} else {			
			return getAverageTemperature();
		}
	}
	
	private TemperatureDTO getSolTemperature(Integer sol) {
		
		SolsResponseDTO response = getSols();
		
		Predicate<Entry<String, SolDTO>> filter = resp -> resp.getKey().equals(sol.toString());  
		
		Entry<String, SolDTO> solDTO = 
				
		response
			.getSols()
			.entrySet()
			.stream()
			.parallel()
			.filter(filter)
			.findFirst()
			.orElse(null);
		
		TemperatureDTO temperature = new TemperatureDTO();
		
		if (solDTO != null) {
			temperature.setAverageTemperature(solDTO.getValue().getAt().getAv());
		} else {
			temperature = getAverageTemperature();
		}
		
		return temperature;
	}

	private TemperatureDTO getAverageTemperature() {

		SolsResponseDTO response = getSols();
		
		Double sum = 
		response
			.getSols()
			.entrySet()
			.stream()
			.parallel()
			.mapToDouble(sol -> sol.getValue().getAt().getAv())
			.sum();
		
		Double average = sum / response.getSol_keys().size();
		
		TemperatureDTO temperature = new TemperatureDTO();
		temperature.setAverageTemperature(average);
		
		return temperature;		
	}
	
	private SolsResponseDTO getSols() {
		
		return service.getSols();		
	}	
}