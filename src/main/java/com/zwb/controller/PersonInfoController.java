package com.zwb.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zwb.entity.AreaInfo;
import com.zwb.entity.PersonInfo;
import com.zwb.service.IAreaInfoService;
import com.zwb.service.IPersonInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
@Controller
@RequestMapping("/zwb/person-info")
public class PersonInfoController {

    @Autowired
    IPersonInfoService iPersonInfoService;

    @Autowired
    IAreaInfoService iAreaInfoService;

    @ApiOperation("index页面")
    @RequestMapping("index")
    public String index(Model model){
        List<PersonInfo> list = iPersonInfoService.list();
        model.addAttribute("list",list);
        return "index";
    }

    @ApiOperation("修改信息")
    @RequestMapping("/update/{id}")
    public String update(@PathVariable(name = "id") int id ,Model model){
        QueryWrapper<PersonInfo> personInfoQueryWrapper = new QueryWrapper<>();
        personInfoQueryWrapper.eq("person_id",id);
        PersonInfo one = iPersonInfoService.getOne(personInfoQueryWrapper);
        model.addAttribute("one",one);
        //查询所有编码
        List<AreaInfo> list = iAreaInfoService.list();
        model.addAttribute("list",list);

        return "update";
    }

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
    public String updatePersonInfo(PersonInfo personInfo ,Model model){
        Integer personAreaId = personInfo.getPersonAreaId();
        System.out.print(personAreaId);

        QueryWrapper<PersonInfo> wrapper = new QueryWrapper<>();
        wrapper.eq("person_id",personInfo.getPersonId());
        boolean update = iPersonInfoService.update(personInfo,wrapper);
        if (update){
            model.addAttribute("msg","更新成功");
            return "update";
        }else{
            model.addAttribute("msg","更新失败");
            return "update";
        }

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
