package com.anvvv.demo.webservice.service.Impl;

import com.anvvv.demo.webservice.model.User;
import com.anvvv.demo.webservice.service.ICommonService;

public class CommonServiceImpl implements ICommonService {
    @Override
    public String sayHello(String name) {
        return "helllll,"+name;
    }

    @Override
    public User getUser(String name) {
        return new User(1000,"安鹏",29);
    }
}
