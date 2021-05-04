package com.xuyujie.service;

import com.xuyujie.pojo.User;
import org.springframework.stereotype.Service;


public interface userService {
    //增加用户
    public int addUser(User user);
    //删除用户
    public int deleteUserById(int id);
    //修改用户
    public int updateUser(User user);
    //查找用户
    public User queryUserById(int id);
}
