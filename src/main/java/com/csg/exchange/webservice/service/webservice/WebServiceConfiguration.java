package com.csg.exchange.webservice.service.webservice;

import javax.xml.ws.Endpoint;
import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.boot.autoconfigure.web.servlet.DispatcherServletPath;
import org.springframework.beans.factory.annotation.Autowired;

import com.csg.exchange.webservice.service.webservice.PushService;
import com.csg.exchange.webservice.service.webservice.PushServiceImpl;

@Configuration
public class WebServiceConfiguration {

    @Autowired
    private Bus bus;
    @Autowired
    private PushService pushService;

    @Bean
    public ServletRegistrationBean disServlet() {
        return new ServletRegistrationBean(new CXFServlet(), "/test/*");
    }
    @Bean(name = Bus.DEFAULT_BUS_ID)
     public SpringBus springBus() {
        return new SpringBus();
    }

    @Bean
    public PushService pushService(){
        return new PushServiceImpl();
    }

    @Bean
    public Endpoint endpoint(){
        EndpointImpl endpoint = new EndpointImpl(springBus(), pushService());
        endpoint.publish("/data");
        return endpoint;
    }

}

