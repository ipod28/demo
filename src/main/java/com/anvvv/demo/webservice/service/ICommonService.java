package com.anvvv.demo.webservice.service;

import com.anvvv.demo.webservice.model.User;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(name = "CommonService",targetNamespace = "www.anvvv.com")
public interface ICommonService {
    @WebMethod
    public  String sayHello(@WebParam(name = "name") String name);

    @WebMethod
    public User getUser(@WebParam(name = "name") String name);

}