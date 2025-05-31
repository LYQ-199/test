package com.example.maven01.service.impl;

import com.example.maven01.mapper.DeptMapper;
import com.example.maven01.pojo.Dept;
import com.example.maven01.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {


    @Autowired
    private DeptMapper deptMapper;

    @Override
    public List<Dept> list() {

        return deptMapper.list();
    }

    @Override
    public void deleteById(Integer id) {

        deptMapper.deleteById(id);
    }

    @Override
    public void adddept(Dept dept) {
        dept.setCreateTime(LocalDateTime.now());
        dept.setUpdateTime(LocalDateTime.now());
        deptMapper.adddept(dept);
    }
}

