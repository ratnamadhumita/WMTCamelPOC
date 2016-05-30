package com.wmt.service;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

@Component
public class RouteServiceImpl implements RouteService {

	private static Logger logger = Logger.getLogger (RouteServiceImpl.class);
	

	@Override
	public String getEURCurrency() {
		logger.info(" getEURCurrency ");
		
		return "Pound";
	}

	@Override
	public void getCurrency() {
		logger.info(" getCurrency ");
		
	}
	
	@Override
	public String getCurrencyDefault() {
		logger.info(" getCurrency Default ");
	
		return "Rupee";
	}

	@Override
	public  String getCurrencyUSA() {
		
		 return "Dollar";
	}
	

}
