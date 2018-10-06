package com.anvvv.demo.web;

import com.anvvv.demo.entity.Area;
import com.anvvv.demo.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class AreaController {
    @Autowired
    private AreaService areaService;
    @RequestMapping("/arealist")
    public String areaList(Model model) {


        List<Area> areaList = areaService.queryArea();
        model.addAttribute("arealist",areaList);
        return "arealist";
    }
}
