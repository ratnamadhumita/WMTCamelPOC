/**
 * 
 */
package com.wmt.application;

import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.endpoint.Server;
import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;
import org.apache.cxf.transport.servlet.CXFServlet;

//import javax.ws.rs.Path;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wmt.controller.CurrencyController;
import com.wmt.controller.CustomCurrencyControllerImpl;

/**
 * @author Neelanjan Banerjee
 *
 *Spring Boot Application class
 */

@SpringBootApplication
@ComponentScan(basePackages ="com.wmt")
@EntityScan(basePackages = {"com.wmt"})
@RestController
@ImportResource({"classpath:beans.xml", "classpath:META-INF/cxf/cxf.xml"})
public class Application {

	
	
	/*
	 @RequestMapping(value = { "/" } )
	    public String index() {
	        return "************  Greetings from Spring Camel Boot!";
	    }
	*/
	 
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ApplicationContext ctx = SpringApplication.run(Application.class, args);

        System.out.println("Let's inspect the beans provided by Spring Boot:");

        /*
        String[] beanNames = ctx.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        for (String beanName : beanNames) {
            System.out.println("****************** :: " + beanName);
        }
        */
        
        
	}
	
	
	@Bean
    public ServletRegistrationBean servletRegistrationBean(ApplicationContext context) {
        return new ServletRegistrationBean(new CXFServlet(), "/*");
    }
    
	/*
	@Bean
    public Server rsServer() {
        JAXRSServerFactoryBean endpoint = new JAXRSServerFactoryBean();
        endpoint.setServiceBean(new CustomCurrencyControllerImpl() );
        endpoint.setAddress("/client");
        return endpoint.create();
    }*/
    
    
	
	
	@Bean(name=Bus.DEFAULT_BUS_ID)
    public SpringBus springBus() {      
        return new SpringBus();
    }
	
	// Used when deploying to a standalone servlet container, i.e. tomcat
	/*
    @Override
    protected SpringApplicationBuilder configure ( SpringApplicationBuilder application ) {
        return application.sources(Application.class);
    }
    
    */
    

}
