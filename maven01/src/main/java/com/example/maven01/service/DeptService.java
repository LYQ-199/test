package com.example.maven01.service;

import com.example.maven01.pojo.Dept;

import java.util.List;

public interface DeptService {
    List<Dept> list();

    void deleteById(Integer id);

    void adddept(Dept dept);
}
