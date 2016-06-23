package com.wmt.processors;

import java.util.HashMap;
import java.util.Map;

import org.apache.camel.Message;
import org.apache.camel.Exchange;
import org.apache.camel.ExchangePattern;
import org.apache.camel.Processor;
import org.apache.cxf.message.MessageContentsList;
import com.wmt.vo.Country;
import org.apache.log4j.Logger;


public class CustomProcessor implements Processor {

	private static Logger logger = Logger.getLogger (CustomProcessor.class);
	

	@Override
	public void process(Exchange exchangeContent) throws Exception {
		
		//Country myPojo= exchangeContent.getIn().getBody(Country .class);
		
		Object body = exchangeContent.getIn().getBody(String.class);
		logger.info(" ##################################>>>>>>>>>>>>>>>> body is :: " + body);
		//String cnt = myPojo.getCountry2();
		//logger.info(" ##################################>>>>>>>>>>>>>>>> country is :: " + cnt);
		MessageContentsList inMessage = exchangeContent.getIn().getBody(MessageContentsList.class);
		
		//logger.info(" ############### @@@@@@@ inMessage :: " + inMessage);
		
		String obj = (String)inMessage.get(0);
		//exchangeContent.getIn().setBody(obj);
		logger.info(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>== " + obj);
		
		exchangeContent.getOut().setBody(obj);
		
		Map<String, Object> headerMap = new HashMap<String, Object> ();
		
		headerMap.put("Http-Method", "POST");
		headerMap.put("Content-Type", "application/json");
		
		exchangeContent.getOut().setHeaders(headerMap);		

	}
	
	

}
