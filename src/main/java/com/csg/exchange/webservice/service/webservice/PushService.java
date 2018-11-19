package com.csg.exchange.webservice.service.webservice;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

import com.csg.exchange.webservice.dao.CsgMessage;

@WebService
public interface PushService {

    @WebMethod
    String pushService(@WebParam(name = "data") String data, @WebParam(name = "token") String token, @WebParam(name = "vssid") String vssid);

}
