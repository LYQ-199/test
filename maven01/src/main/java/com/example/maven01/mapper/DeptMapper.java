package com.example.maven01.mapper;

import com.example.maven01.pojo.Dept;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
//测试 第三次测试
@Mapper
public interface DeptMapper {
    @Select("select *from tlias.dept")
    List<Dept> list();

    @Delete("delete from tlias.dept where id=#{id}")
    void deleteById(Integer id);

    @Insert("insert into tlias.dept(name,create_time,update_time) values(#{name},#{createTime},#{updateTime})")
    void adddept(Dept dept);

    void update(Dept dept);
}

