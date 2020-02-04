package com.preoday.nasa.api.dto.sol;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WindDirectionDTO {

	private Map<String, Object> compass_pt_no;
	private Object most_common;
	private Double compass_degrees;
	private String compass_point;
	private Double compass_right;
	private Double compass_up;
	private Double ct;
	
	public WindDirectionDTO() {}

	public Map<String, Object> getCompass_pt_no() {
		return compass_pt_no;
	}

	public void setCompass_pt_no(Map<String, Object> compass_pt_no) {
		this.compass_pt_no = compass_pt_no;
	}

	public Object getMost_common() {
		return most_common;
	}

	public void setMost_common(Object most_common) {
		this.most_common = most_common;
	}

	public Double getCompass_degrees() {
		return compass_degrees;
	}

	public void setCompass_degrees(Double compass_degrees) {
		this.compass_degrees = compass_degrees;
	}

	public String getCompass_point() {
		return compass_point;
	}

	public void setCompass_point(String compass_point) {
		this.compass_point = compass_point;
	}

	public Double getCompass_right() {
		return compass_right;
	}

	public void setCompass_right(Double compass_right) {
		this.compass_right = compass_right;
	}

	public Double getCompass_up() {
		return compass_up;
	}

	public void setCompass_up(Double compass_up) {
		this.compass_up = compass_up;
	}

	public Double getCt() {
		return ct;
	}

	public void setCt(Double ct) {
		this.ct = ct;
	}
}