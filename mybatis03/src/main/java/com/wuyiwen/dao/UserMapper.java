package com.wuyiwen.dao;

import com.wuyiwen.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface UserMapper {


    // 查
    List<User> getUserList();

    User getUserById(@Param("id") int id);

    // 添加
    int addUser(User user);


    int updateUser(User user);

    int deleteUser(int id);

    List<User> getUserListByLimit(Map<String,Integer> map);


    @Select("select * from user")
    List<User> getUserList2();

    User getUserByParam(@Param("cao") int id);


    List<HashMap> getUserListByIds(@Param(value="ids")String ids);








}
