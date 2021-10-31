package com.zwb.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zwb.entity.AreaInfo;
import com.zwb.service.IAreaInfoService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zwb
 * @since 2021-10-31
 */
@RestController
@RequestMapping("/zwb/area-info")
public class AreaInfoController {

    @Autowired
    IAreaInfoService iAreaInfoService;

    @ApiOperation("查询")
    @PostMapping("/seleceAreaInfo")
    public AreaInfo seleceAreaInfo(Integer id){
        QueryWrapper<AreaInfo> areaInfoQueryWrapper = new QueryWrapper<>();
        areaInfoQueryWrapper.eq("area_id",id);
        AreaInfo one = iAreaInfoService.getOne(areaInfoQueryWrapper);
        return one;
    }

    @ApiParam("查询所有")
    @PostMapping("/allAreaInfo")
    public List<AreaInfo> allAreaInfo(){
        List<AreaInfo> list = iAreaInfoService.list();
        return list;
    }

}
