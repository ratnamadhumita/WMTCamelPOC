package com.wmt.controller;


import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;


public interface CurrencyController  {
	
	
	@GET
	@Path("/currencyGeneric")
	@Produces(MediaType.APPLICATION_JSON)
	public String getCurrency ( @QueryParam("country") String country );
	
	/*
	@Path("/client/currencyEUR")
	//@Produces(MediaType.APPLICATION_JSON)
	@Produces("text/plain")
	public String getCurrencyEUR ( @QueryParam("country") String country );
	
	@Path("/client/currencyUSA")
	public String getCurrencyUSA ( @QueryParam("country") String country ) ;
	
	@GET
	@Path("/client/currencyDefault")
	@Produces(MediaType.APPLICATION_JSON)
    public String getCurrencyDefault(@QueryParam("country") String country );*/

	
}
