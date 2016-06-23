package com.wmt.vo;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Country implements Serializable {
	
	@JsonProperty
	public String country2;

	
	public String getCountry2() {
		return country2;
	}



	public void setCountry2(String country2) {
		this.country2 = country2;
	}



	public Country() {
		super();
		this.country2 = "";
	}



	public Country(String country) {
		super();
		this.country2 = country;
	}







	

}
