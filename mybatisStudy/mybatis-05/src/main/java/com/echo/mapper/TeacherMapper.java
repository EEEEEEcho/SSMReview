package com.echo.mapper;

import com.echo.pojo.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface TeacherMapper {
    @Select("select * from teacher where id=#{tid}")
    Teacher getTeacherById(@Param("tid")int tid);
}
