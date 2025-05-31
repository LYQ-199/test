package com.example.maven01.mapper;

import com.example.maven01.pojo.Dept;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DeptMapper {
    @Select("select *from tlias.dept")
    List<Dept> list();

    @Delete("delete from tlias.dept where id=#{id}")
    void deleteById(Integer id);

    @Insert("insert into dept(name,create_time,update_time) value(#{name},#{createTime},#{updateTime})")
    void adddept(Dept dept);
}

