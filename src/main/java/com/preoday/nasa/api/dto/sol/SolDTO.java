package com.preoday.nasa.api.dto.sol;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SolDTO {

	@JsonProperty("AT")
	private AtmosphericTemperatureDTO at;
	
	@JsonProperty("First_UTC")
	private String first_utc;

	@JsonProperty("HWS")
	private HorizontalWindSpeedDTO hws;
	
	@JsonProperty("Last_UTC")
	private String last_utc;

	@JsonProperty("PRE")
	private AtmosphericPressureDTO pre;
	
	@JsonProperty("Season")
	private String season;
	
	@JsonProperty("WD")
	private Map<String, WindDirectionDTO> wd;
	
	public SolDTO() {}

	public AtmosphericTemperatureDTO getAt() {
		return at;
	}

	public void setAt(AtmosphericTemperatureDTO at) {
		this.at = at;
	}

	public String getFirst_utc() {
		return first_utc;
	}

	public void setFirst_utc(String first_utc) {
		this.first_utc = first_utc;
	}

	public HorizontalWindSpeedDTO getHws() {
		return hws;
	}

	public void setHws(HorizontalWindSpeedDTO hws) {
		this.hws = hws;
	}

	public String getLast_utc() {
		return last_utc;
	}

	public void setLast_utc(String last_utc) {
		this.last_utc = last_utc;
	}

	public AtmosphericPressureDTO getPre() {
		return pre;
	}

	public void setPre(AtmosphericPressureDTO pre) {
		this.pre = pre;
	}

	public String getSeason() {
		return season;
	}

	public void setSeason(String season) {
		this.season = season;
	}

	public Map<String, WindDirectionDTO> getWd() {
		return wd;
	}

	@JsonAnySetter
	public void setWd(String key, WindDirectionDTO value) {
		wd.put(key, value);
	}
}