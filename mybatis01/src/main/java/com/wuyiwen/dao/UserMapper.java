package com.wuyiwen.dao;

import com.wuyiwen.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {


    // 查
    List<User> getUserList();

    User getUserById(@Param("id") int id);

    // 添加
    int addUser(User user);


    int updateUser(User user);

    int deleteUser(int id);





}
