package com.wmt.controller;


import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.apache.camel.CamelContext;
import org.apache.cxf.message.Exchange;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Component;

import com.wmt.vo.Country;




@ImportResource("classpath:beans.xml")
@Component	
public class CurrencyControllerImpl implements CurrencyController {
	
	private static Logger logger = Logger.getLogger (CurrencyControllerImpl.class);
	
	@Autowired
	CamelContext camelContext;
	
	
	@GET
	@Path("/currencyGeneric")
	@Produces(MediaType.APPLICATION_JSON)
	public String getCurrency ( @QueryParam("country") String country ) {
		
		logger.info(" getCurrency :: " + country);
				
		return country;
	}

	
}
