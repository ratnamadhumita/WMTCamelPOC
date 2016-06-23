package com.wmt.controller;


import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Component;

import com.wmt.vo.Country;
import com.wmt.vo.CurrencyVO;




@ImportResource("classpath:beans.xml")
@Component	
@Path(value="/rest")
public interface CustomCurrencyController {
	
/*	@POST
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
    public CurrencyVO getCurrencyDefault( );*/
	
	/*@POST
	@Path("/currencyGeneric2/{country}")
	@Produces(MediaType.APPLICATION_JSON)
    public CurrencyVO getCurrencyNew(@PathParam("country") String country);//(String country);*/
	
	/*
	Commented by Amrita 
	@POST
	@Path(value="/currencyUSA")
	@Produces({MediaType.APPLICATION_JSON})
	public CurrencyVO getCurrencyGeneric(Country country);
	
	@POST
	@Path(value="/currencyGeneric")
	@Produces({MediaType.APPLICATION_JSON})
	public Response getCurrencyUSA(Country country);
	
	@POST
	@Path(value="/currencyUSA")
	@Produces({MediaType.APPLICATION_JSON})
	public CurrencyVO getCurrencyGeneric(String country);*/
	
	
	@POST
	@Path(value="/currencyGeneric")
	@Produces({MediaType.APPLICATION_JSON })
	public CurrencyVO getCurrencyGeneric(String country);
	
	@POST
	@Path("/currencyUSA")
	@Produces(MediaType.APPLICATION_JSON)
	public CurrencyVO getCurrencyUSA (String country);

	
}
