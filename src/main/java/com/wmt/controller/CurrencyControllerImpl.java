package com.wmt.controller;


import java.util.Map;

import org.apache.cxf.jaxrs.provider.ProviderFactory;
import org.apache.cxf.Bus;
import javax.ws.rs.GET;
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




@ImportResource("classpath:beans.xml")
@Component	
public class CurrencyControllerImpl implements CurrencyController {
	
	private static Logger logger = Logger.getLogger (CurrencyControllerImpl.class);

	/**
	 * Method for send error message to the product UI.
	 * 
	 * @return null
	 */
	
	@Autowired
	CamelContext camelContext;
	
	
	@GET
	@Path("/currencyGeneric")
	@Produces(MediaType.APPLICATION_JSON)
	public String getCurrency ( @QueryParam("country") String country ) {
		
		logger.info(" getCurrency :: " + country);
		
		
		return null;
	}
	
	/*
	@GET
	@Path("/client/currencyEUR")
	//@Produces(MediaType.APPLICATION_JSON)
	@Produces("text/plain")
	public String getCurrencyEUR (  @QueryParam("country") String country   ) {
		
		 logger.info (" CurrencyController getCurrencyEUR ****************  ");
		 return "Pound";
	}

	
	@GET
	@Path("/client/currenycUSA")
	@Produces(MediaType.APPLICATION_JSON)
	public String getCurrencyUSA ( @QueryParam("country") String country ) {
		
		 logger.info (" CurrencyController getCurrencyUSA  ");
		
		 return "Dollar";
	}
	
	@GET
	@Path("/client/currencyDefault")
//	@Produces(MediaType.APPLICATION_JSON)
    public String getCurrencyDefault(@QueryParam("country") String country ) {
        
	 logger.info (" CurrencyController Default curreny  " );
	
	 return "Rupee";
    }
*/

	
}
