package com.ccnu.eldercare.infrared.controller;

import com.ccnu.eldercare.infrared.service.InfraredService;
import com.ccnu.eldercare.model.infrared.Infrared;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author ganccl
 * @create 2022-11-30 19:55
 */
@RestController
@RequestMapping("/admin/eldercare/infrared")
public class InfraredController {

    //注入service
    @Autowired
    private InfraredService infraredService;

    //1.查询红外表所有信息
    @ApiOperation(value = "获取所有红外信息")
    @GetMapping("findAll")
    public List<Infrared> findAllInfrared(){
        //调用service的方法
        List<Infrared> list = infraredService.list();
        return list;
    }

    //2.逻辑删除红外
    @ApiOperation(value = "逻辑删除红外")
    @DeleteMapping("{id}")
    public boolean removeInfrared(@PathVariable Long id){
        boolean flag = infraredService.removeById(id);
        return flag;
    }
}
