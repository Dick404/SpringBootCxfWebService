package com.csg.exchange.webservice.service.webservice;

import com.csg.exchange.webservice.service.webservice.PushService;

import javax.jws.WebService;
import org.springframework.stereotype.Component;

@WebService(serviceName="services", targetNamespace = "http://webservice.service.webservice.exchange.csg.com/",endpointInterface = "com.csg.exchange.webservice.service.webservice.PushService")
@Component
public class PushServiceImpl implements PushService{

    @Override
    public String pushService(String data, String token, String vssid){
        return "hello";
    }
}
