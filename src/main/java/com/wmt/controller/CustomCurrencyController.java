package com.wmt.controller;


import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Component;

import com.wmt.vo.CurrencyVO;




@ImportResource("classpath:beans.xml")
@Component	
public interface CustomCurrencyController  {
	
	@POST
	@Path("/currencyEUR")
	@Produces(MediaType.APPLICATION_JSON)
	public CurrencyVO getCurrencyEUR ();

	
	@POST
	@Path("/currencyUSA")
	@Produces(MediaType.APPLICATION_JSON)
	public CurrencyVO getCurrencyUSA (  );
	
	@POST
	@Path("/currencyDefault")
	@Produces(MediaType.APPLICATION_JSON)
    public CurrencyVO getCurrencyDefault( );

	
}
