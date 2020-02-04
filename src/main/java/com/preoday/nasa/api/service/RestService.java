package com.preoday.nasa.api.service;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.preoday.nasa.api.dto.SolsResponseDTO;

@Component
public class RestService {

	private static final String API_KEY = "dUjh03x8vcg4mnkfmrQMhdGKbj9Esd4cQLY0f7Hl";
	private static final String FEEDTYPE = "json";
	private static final String VERSION = "1.0";
	private static final String URL = "https://api.nasa.gov/insight_weather/?api_key=" +API_KEY+ "&feedtype=" +FEEDTYPE+ "&ver=" +VERSION;

	public SolsResponseDTO getSols() {

		RestTemplate restTemplate = new RestTemplate();

		return restTemplate.getForObject(URL, SolsResponseDTO.class);
	}
}