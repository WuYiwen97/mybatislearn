package com.wuyiwen.pojo;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.apache.ibatis.type.Alias;

@Getter
@Setter
@ToString
@Alias("User")
public class User {

    private int id;
    private String name;
    private String password;
    private String address;
    private String phone;

}
