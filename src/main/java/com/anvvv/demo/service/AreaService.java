package com.anvvv.demo.service;

import com.anvvv.demo.entity.Area;

import java.util.List;

public interface AreaService {
    List<Area> queryArea();

    Area queryAreaById(int areaId);

    int insertArea(Area area);

    //删除
    int deleteArea(int areaId);
    //update
    Area updateArea(int areaId);
}
