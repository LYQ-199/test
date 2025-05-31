package com.example.maven01.controller;


import com.example.maven01.pojo.Dept;
import com.example.maven01.pojo.Result;
import com.example.maven01.service.DeptService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    //    @RequestMapping(value = "/depts",method = RequestMethod.GET)//指定请求方式为get
    @GetMapping("/depts") //上面的注解有些过于麻烦，这个更方便，直接
    public Result list(){
        log.info("查询全部部门数据");
        List<Dept> deptList=deptService.list();
        return Result.success(deptList);
    }

    @DeleteMapping("/depts/{id}")
    public Result delete(@PathVariable Integer id){
        log.info("根据id来删除部门：{}",id);

        deptService.deleteById(id);
        return Result.success();
    }

//添加
    @PostMapping("/depts")
    public Result add(@RequestBody Dept dept){

        deptService.adddept(dept);
        return Result.success();
    }
    //修改


    @PutMapping("/depts/")
    public Result update(){

        return Result.success();
    }
}

