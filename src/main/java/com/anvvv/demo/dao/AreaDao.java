package com.anvvv.demo.dao;

import com.anvvv.demo.entity.Area;

import java.util.List;

public interface AreaDao {
    /* 一次返回所有Area 信息 */
    List<Area> queryArea();

    Area queryAreaById(int areaId);
    /* 增加 */
    int insertArea(Area area);
    /* 删除 */
    int deleteArea(int areaId);
    /* 更新 */
    int updateArea(Area area);
}
