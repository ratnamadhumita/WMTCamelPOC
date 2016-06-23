package com.wmt.controller;


import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.wmt.vo.Country;

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON) 
public interface CurrencyController  {
	
	
	/*@GET
	@Path("/currencyGeneric")
	@Produces(MediaType.APPLICATION_JSON)
	public String getCurrency ( @QueryParam("country") String country );*/
	
	/*@POST
	@Path("/currencyGeneric")
	public Country getCurrency (Country country );*/
	
	
	@GET
	@Path("/currencyGeneric")
	@Produces(MediaType.APPLICATION_JSON)
	public String getCurrency ( @QueryParam("country") String country );
	


	
}
