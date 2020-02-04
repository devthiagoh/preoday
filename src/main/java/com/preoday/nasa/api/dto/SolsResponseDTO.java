package com.preoday.nasa.api.dto;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.preoday.nasa.api.dto.sol.SolDTO;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SolsResponseDTO {

	private Map<String, SolDTO> sols = new LinkedHashMap<>();
	
	private List<String> sol_keys;
	
	private Object validity_checks;
	
	public SolsResponseDTO() {}

	public Map<String, SolDTO> getSols() {
		return sols;
	}

	@JsonAnySetter
	public void setSols(String key, SolDTO value) {
		sols.put(key, value);
	}

	public List<String> getSol_keys() {
		return sol_keys;
	}

	public void setSol_keys(List<String> sol_keys) {
		this.sol_keys = sol_keys;
	}

	public Object getValidity_checks() {
		return validity_checks;
	}

	public void setValidity_checks(Object validity_checks) {
		this.validity_checks = validity_checks;
	}
}