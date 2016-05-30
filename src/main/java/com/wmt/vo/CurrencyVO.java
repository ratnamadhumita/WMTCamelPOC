package com.wmt.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CurrencyVO {
	
	@JsonProperty
	public String country;
	
	@JsonProperty
	public String currency;

	
	public CurrencyVO() {
		super();
		this.country = "";
		this.currency = "";
	}



	public CurrencyVO(String country, String currency) {
		super();
		this.country = country;
		this.currency = currency;
	}



	public String getCountry() {
		return country;
	}



	public void setCountry(String country) {
		this.country = country;
	}



	public String getCurrency() {
		return currency;
	}



	public void setCurrency(String currency) {
		this.currency = currency;
	}



	@Override
	public String toString() {
		return "CurrencyVO [country=" + country + ", currency=" + currency + "]";
	}
	
	

}
