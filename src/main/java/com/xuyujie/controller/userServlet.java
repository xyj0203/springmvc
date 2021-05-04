package com.xuyujie.controller;

import com.xuyujie.pojo.User;
import com.xuyujie.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.xml.ws.RequestWrapper;
@Controller
public class userServlet {
    @Autowired
    private userService userservice;
    @RequestMapping(path = "add")
    public String addUser(User user){
        System.out.println(user);
        int i = userservice.addUser(user);
        return "success";
    }
    @RequestMapping(path = "delate")
    public String deleteUser(int id){
        int i = userservice.deleteUserById(id);
        System.out.println(i);
        return "success";
    }
    @RequestMapping(path = "update")
    public String updateUser(User user){
        int i = userservice.updateUser(user);
        System.out.println(i);
        return "success";
    }
    @RequestMapping(path = "query")
    public String updateUser(int id){
        User user = userservice.queryUserById(id);
        System.out.println(user);
        return "success";
    }
}
