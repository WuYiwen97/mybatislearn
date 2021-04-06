package com.wuyiwen.dao;

import com.wuyiwen.pojo.Student;
import com.wuyiwen.pojo.Teacher;
import com.wuyiwen.utls.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class MyTest {

    @Test
    public void getTeacher(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        // Teacher teacher = mapper.getTeacher(1);
        StudentMapper mapper1 = sqlSession.getMapper(StudentMapper.class);
        List<Student> studentList = mapper1.getStudentList();
        //studentList.forEach(student -> System.out.println(student));


        List<Student> studentList2 = mapper1.getStudentList2();
        //studentList2.forEach(student -> System.out.println(student));

        TeacherMapper mapper2 = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher2 = mapper2.getTeacher2(1);
        //System.out.println(teacher2);

        Teacher teacher3 = mapper2.getTeacher3(1);
        System.out.println(teacher3);

    }
}


