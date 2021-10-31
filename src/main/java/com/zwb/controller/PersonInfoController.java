package com.zwb.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zwb.entity.PersonInfo;
import com.zwb.service.IPersonInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
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
@Api
@RestController
@RequestMapping("/zwb/person-info")
public class PersonInfoController {

    @Autowired
    IPersonInfoService iPersonInfoService;

    @ApiOperation("查询所有数据")
    @PostMapping("/allPersonInfo")
    public List<PersonInfo> seleceAllPerson(){
        List<PersonInfo> list = iPersonInfoService.list();
        return list;
    }

    @ApiOperation("增加")
    @PostMapping("/addPersonInfo")
    public boolean addPersonInfo(PersonInfo personInfo){
        boolean save = iPersonInfoService.save(personInfo);
        return save;
    }

    @ApiOperation("修改")
    @PostMapping("/updatePersonInfo")
    public boolean updatePersonInfo(PersonInfo personInfo){
        QueryWrapper<PersonInfo> wrapper = new QueryWrapper<>();
        wrapper.eq("person_id",personInfo.getPersonId());
        boolean update = iPersonInfoService.update(personInfo,wrapper);
        return update;
    }

    @ApiOperation("删除")
    @PostMapping("/delectPersonInfo")
    public boolean delectPersonInfo(Integer id){
        boolean delete = iPersonInfoService.removeById(id);
        return delete;
    }

    @ApiOperation("查询")
    @PostMapping("/selecePersonInfo")
    public List<PersonInfo> selecePersonInfo(String str){
        QueryWrapper<PersonInfo> personInfo = new QueryWrapper<>();
        personInfo.like("person_id",str).or().like("person_name",str).or().like("person_area_id",str).or().like("person_age",str).or().like("person_address",str);
        List<PersonInfo> list = iPersonInfoService.list(personInfo);
        return list;
    }


}
