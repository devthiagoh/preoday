package com.preoday.nasa.api.dto.sol;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class HorizontalWindSpeedDTO {

	private Double av;
	private Double ct;
	private Double mn;
	private Double mx;
	
	public HorizontalWindSpeedDTO() {}

	public Double getAv() {
		return av;
	}

	public void setAv(Double av) {
		this.av = av;
	}

	public Double getCt() {
		return ct;
	}

	public void setCt(Double ct) {
		this.ct = ct;
	}

	public Double getMn() {
		return mn;
	}

	public void setMn(Double mn) {
		this.mn = mn;
	}

	public Double getMx() {
		return mx;
	}

	public void setMx(Double mx) {
		this.mx = mx;
	}	
}