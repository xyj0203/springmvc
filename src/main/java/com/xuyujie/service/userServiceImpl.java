package com.xuyujie.service;

import com.xuyujie.dao.userDao;
import com.xuyujie.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class userServiceImpl implements userService{
    @Autowired
    private userDao userDao;

    @Override
    public int addUser(User user) {
        System.out.println(user);
        if(user.getUname()==null){
            throw new RuntimeException("数据有误");
        }
        int result = userDao.addUser(user);
        System.out.println(result);
        return result;
    }

    @Override
    public int deleteUserById(int id) {
       userDao.deleteUser(id);
        return 0;
    }

    @Override
    public int updateUser(User user) {
        userDao.updateUser(user);
        return 0;
    }

    @Override
    public User queryUserById(int id) {
       return userDao.queryUser(id);
    }
}