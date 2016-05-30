package com.wmt.processors;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.component.cxf.common.message.CxfConstants;
import org.apache.cxf.message.MessageContentsList;
import com.wmt.controller.CurrencyController;
import org.apache.log4j.Logger;



public class CustomProcessor implements Processor {

	private static Logger logger = Logger.getLogger (CustomProcessor.class);

	@Override
	public void process(Exchange exchangeContent) throws Exception {
		logger.debug(" body is :: " + exchangeContent.getIn().getBody() );
		
		MessageContentsList inMessage = exchangeContent.getIn().getBody(MessageContentsList.class);
		
		logger.debug(" inMessage :: " + inMessage);
		
		exchangeContent.getOut().setBody("");
		
		Map<String, Object> headerMap = new HashMap<String, Object> ();
		
		headerMap.put("Http-Method", "GET");
		headerMap.put("Content-Type", "application/json");
		
		exchangeContent.getOut().setHeaders(headerMap);
		
		

	}

}
