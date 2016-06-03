package com.wmt.controller;


import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.apache.log4j.Logger;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Component;

import com.wmt.vo.CurrencyVO;




@ImportResource("classpath:beans.xml")
@Component	
public class CustomCurrencyControllerImpl  implements CustomCurrencyController {
	
	private static Logger logger = Logger.getLogger (CustomCurrencyControllerImpl.class);

/*
 * Added by Madhumita
 * 
 * 	@POST
	@Path("/currencyEUR")
	@Produces(MediaType.APPLICATION_JSON)
	public CurrencyVO getCurrencyEUR ( ) {
		
		 Response response;
		 logger.info (" CurrencyController getCurrencyEUR  ");
		 
		 CurrencyVO crcyVO = new CurrencyVO ("Europe", "Pound");
		
		 //response = Response.ok(crcyVO).status(Status.OK).build();
		 //return response;
		 
		 return crcyVO;
	}

	@POST
	@Path("/currencyUSA")
	@Produces(MediaType.APPLICATION_JSON)
	public CurrencyVO getCurrencyUSA (  ) {
		
		 Response response;
		 logger.info (" CurrencyController getCurrencyUSA  ");
		 
		 CurrencyVO crcyVO = new CurrencyVO ("USA", "Dollar");
		 
		// response = Response.ok(crcyVO).status(Status.OK).build();
		// return response;
		 
		 return crcyVO;
	}
	
	@POST
	@Path("/currencyDefault")
	@Produces(MediaType.APPLICATION_JSON)
    public CurrencyVO getCurrencyDefault( ) {
		
		Response response;
        
		logger.info (" CurrencyController Default curreny  " );
		CurrencyVO crcyVO = new CurrencyVO ("Default", "default");
		
		//response = Response.ok(crcyVO).status(Status.OK).build();
		// return response;
		
		 return crcyVO;
    }
*/
	@POST
	@Path("/currencyGeneric2")
	@Produces(MediaType.APPLICATION_JSON)
	public CurrencyVO getCurrencyNew ( @QueryParam("country") String country ) {
		
		logger.info(" %%%%%%%%%%%%%%% getCurrency :: " + country);
		logger.info (" CurrencyController  curreny  "  + country);
		CurrencyVO crcyVO = new CurrencyVO (country, country);
		
		
		return crcyVO;
	}

	

	
}
