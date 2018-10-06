package com.anvvv.demo.service.impl;

import com.anvvv.demo.dao.AreaDao;
import com.anvvv.demo.entity.Area;
import com.anvvv.demo.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
@Service
public class AreaServiceImpl implements AreaService {
    @Autowired
    private AreaDao areaDao;
    @Override
    public List<Area> queryArea() {
        return areaDao.queryArea();
    }

    @Override
    public Area queryAreaById(int areaId) {
        return areaDao.queryAreaById(areaId);
    }

    @Transactional
    @Override
    public int insertArea(Area area) {
        if (area.getAreaName()!=null&&"".equals(area.getAreaName())){
            area.setCreateTime(new Date());
            area.setLastEditTime(new Date());
            try {
                int result=areaDao.insertArea(area);
                if (result>0){
                    return  1;
                }else {
                    throw new RuntimeException("插入失败");

                }
            }catch (Exception e){
                throw new RuntimeException("插入失败"+e.getMessage());

            }
        }
        else {
            throw  new RuntimeException("区域信息不能为空");
        }

    }

    @Override
    public int deleteArea(int areaId) {
        return 0;
    }

    @Override
    public Area updateArea(int areaId) {
        return null;
    }
}
