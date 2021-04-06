package com.wuyiwen.dao;

import com.wuyiwen.pojo.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TeacherMapper {

    @Select("select * from teacher where id = #{id}")
    Teacher getTeacher(@Param("id") int id);

    List<Teacher> getTeacherList();


    Teacher getTeacher2(@Param("id") int id);


    Teacher getTeacher3(@Param("id") int id);



}
