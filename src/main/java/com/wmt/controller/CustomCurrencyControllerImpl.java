package com.wmt.controller;


import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.apache.camel.Consume;
import org.apache.log4j.Logger;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Component;

import com.wmt.vo.Country;
import com.wmt.vo.CurrencyVO;




@ImportResource("classpath:beans.xml")
@Component	
@Path(value="/rest")
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


/* commented by Amrita
	@POST
	@Path(value="/currencyGeneric")
	@Produces({MediaType.APPLICATION_JSON })
	public CurrencyVO getCurrencyGeneric(Country country) {
		
		logger.info (" CurrencyController getCurrencyGeneric  ");
		
	        if (country == null || country.equals("")) {
	        	
	        	CurrencyVO crcyVO1 = new CurrencyVO ("AM","AMS");
	        	return  crcyVO1;//Response.ok(crcyVO1).status(Status.OK).build();
	        }
	        
	        String currency = "INR"; 
		
		CurrencyVO crcyVO = new CurrencyVO (country.getCountry2(), currency);
		
		return crcyVO;//Response.ok(crcyVO).status(Status.OK).build();

	}
	
	@POST
	@Path(value="/currencyGeneric")
	@Produces({MediaType.APPLICATION_JSON })
	public CurrencyVO getCurrencyGeneric(String country) {
		
		logger.info (" CurrencyController getCurrencyGeneric  ");
		
	        if (country == null || country.equals("")) {
	        	
	        	CurrencyVO crcyVO1 = new CurrencyVO ("AM","AMS");
	        	return  crcyVO1;//Response.ok(crcyVO1).status(Status.OK).build();
	        }
	        
	        String currency = "INR"; 
		
		CurrencyVO crcyVO = new CurrencyVO (country, currency);
		
		return crcyVO;//Response.ok(crcyVO).status(Status.OK).build();

	}

	@POST
	@Path("/currencyUSA")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getCurrencyUSA (Country country) {
		
		 logger.info (" CurrencyController getCurrencyUSA  ");
		 
	        if (country == null || country.equals("")) {
	        	return Response.ok().status(Status.OK).build();
	        }	        
		 
		 CurrencyVO crcyVO = new CurrencyVO (country.getCountry2(), "Dollar");
		 
		 return Response.ok(crcyVO).status(Status.OK).build();
	}*/
	
	
	@POST
	@Path(value="/currencyGeneric")
	@Produces({MediaType.APPLICATION_JSON })
	public CurrencyVO getCurrencyGeneric(String country) {
		
		logger.info (" CurrencyController getCurrencyGeneric  ");
		
	        if (country == null || country.equals("")) {
	            return null;
	        }
	        
	        String currency = "INR"; 
		
		CurrencyVO crcyVO = new CurrencyVO (country, currency);
		
		return crcyVO;
	}

	@POST
	@Path("/currencyUSA")
	@Produces(MediaType.APPLICATION_JSON)
	public CurrencyVO getCurrencyUSA (String country) {
		
		 logger.info (" CurrencyController getCurrencyUSA  ");
		 
	        if (country == null || country.equals("")) {
	            return null;
	        }	        
		 
		 CurrencyVO crcyVO = new CurrencyVO (country, "Dollar");
		 
		 return crcyVO;
	}
	

	
}
