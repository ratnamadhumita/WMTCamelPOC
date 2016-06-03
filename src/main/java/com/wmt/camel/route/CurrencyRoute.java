package com.wmt.camel.route;

import org.apache.camel.ExchangePattern;
import org.apache.camel.builder.RouteBuilder;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import com.wmt.processors.CustomProcessor;

@Component
public class CurrencyRoute extends RouteBuilder {

	private static Logger logger = Logger.getLogger (CurrencyRoute.class);
	
	
	
	
	
	@Override
	public void configure() throws Exception {
		
		logger.debug(" **************   CurrencyRoute configure  **************   ");
		
		//restConfiguration().component("restlet");
		//rest("/").get("currreny").to("direct:routeservice");
		//rest("/").post("currreny").to("direct:routeservice");
		
		//from("direct:start")
		//
		
		//restConfiguration().component("restlet");
		//rest("/").get("currreny").produces("application/json").to("direct:start");
		
		//from("restlet:http://localhost:8090/curreny")
		
		//from ("cxfrs:bean:cxfEndpoint?resourceClasses=com.wmt.controller.CurrencyController")
		
		onException(Exception.class).handled(true).log(" Exception Occured ");
		from("cxfrs:bean:currencyService")
		.setExchangePattern(ExchangePattern.InOut)
		//from("direct:start")
		.log("Processing of ${body} done")
			/*Added by MAdhumita
			 * .choice()
				.when(simple("${body} contains 'USA'"))
							//	.to("bean:routeService?method=getCurrencyUSA")
								//.log("to Currency USA")
							//	.setBody(constant("")) 
							.process(new CustomProcessor())
							//	.log("to Currency USA")
							.setExchangePattern(ExchangePattern.InOut)
						.to("cxfrs:bean:currencyServiceClientUSA")
					
						
							//.to("http://localhost:8091/currency/currenyUSA")
				.when(simple("${body} contains 'EUR'"))
							//.to("bean:routeService?method=getEURCurrency")
							
				 			//.log("to Currency EUR").processRef("customProcessor").
							.process(new CustomProcessor())
							.setExchangePattern(ExchangePattern.InOut)
				 			.to("http://localhost:8091/client/currencyEUR?bridgeEndpoint=true")
						//	.to("cxfrs:bean:currencyServiceClientEUR")
							//.to("http://google.com")
				.otherwise()
							//.to("bean:routeService?method=getCurrencyDefault")
							//.log("to Currency Default").processRef("customProcessor")
							.process(new CustomProcessor())
							.setExchangePattern(ExchangePattern.InOut)
							.to("cxfrs:bean:currencyServiceClient")
							//.to("http://localhost:8091/client/currencyDefault")
			.end();
		*/
		
		.process(new CustomProcessor()).setExchangePattern(ExchangePattern.InOut).to("cxfrs:bean:currencyServiceClientNew");
		
	}

}
