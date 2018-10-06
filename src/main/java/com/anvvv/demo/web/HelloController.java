package com.anvvv.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/demo")
public class HelloController {
    @RequestMapping("/demo")
    public String demo(Model model){
        model.addAttribute("name","Thymleef");
        return "demo";

    }
}
