package com.preoday.nasa.api.endpoint;

import static org.springframework.http.HttpStatus.OK;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.preoday.nasa.api.dto.TemperatureDTO;
import com.preoday.nasa.api.service.MarsWeatherService;

@RestController
@RequestMapping(path = "/nasa", consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
public class MarsWeatherEndpoint {

	@Autowired
	private MarsWeatherService service;

	@GetMapping("/temperature")
	public ResponseEntity<?> getAverageTemperature(@RequestParam(name = "sol", required = false) Integer sol) {

		TemperatureDTO entity = service.getAverageTemperature(sol);

		return new ResponseEntity<>(entity, OK);
	}
}