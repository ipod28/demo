package com.anvvv.demo.config.webservice;

import com.anvvv.demo.webservice.service.ICommonService;
import com.sun.xml.internal.ws.api.server.WSEndpoint;
import com.sun.xml.internal.ws.transport.http.server.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import javax.xml.ws.Endpoint;

public class CfxConfiguration {
    @Autowired
    private ICommonService iCommonService;
    @Value("${address}")
    private WSEndpoint address;

    public Endpoint endpoint(){
        EndpointImpl endpoint=new EndpointImpl(address,iCommonService);
        endpoint.publish("/CommonService");
        return  endpoint;
    }
}
