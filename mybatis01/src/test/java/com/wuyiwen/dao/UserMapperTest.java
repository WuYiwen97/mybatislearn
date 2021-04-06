package com.wuyiwen.dao;

import com.wuyiwen.pojo.User;
import com.wuyiwen.utls.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserMapperTest {

    @Test
    public void test(){
        //获得sqlsession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        // 1. getMapper
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.getUserList();

        // 2. selectone / selectlist 不推荐
        //List<User> users = sqlSession.selectList("com.wuyiwen.dao.UserMapper.getUserList");

        userList.forEach(s->System.out.println(s));

        sqlSession.close();

    }

    @Test
    public void getUserById(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);


        User user = mapper.getUserById(1);

        System.out.println(user);


        sqlSession.close();
    }

    @Test
    public void addUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setName("张学友");
        user.setPassword("324234");
        user.setAddress("hongkong");
        user.setPhone("43544543344");
        int i = mapper.addUser(user);
        System.out.println(i);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void updateUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setId(5);
        user.setName("魏晨");
        user.setPassword("324234");
        int i = mapper.updateUser(user);
        System.out.println(i);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void deleteUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int i = mapper.deleteUser(5);
        System.out.println(i);
        sqlSession.commit();
        sqlSession.close();

    }
}
