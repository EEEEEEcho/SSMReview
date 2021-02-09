package com.echo.mapper;

import com.echo.pojo.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TeacherMapper {
    List<Teacher> getAllTeacher();

    //获取指定老师的所有信息以及其学生
    Teacher getTeacher(@Param("id")int id);

    Teacher getTeacher2(@Param("id")int id);
}
