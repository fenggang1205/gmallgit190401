package com.atguigu.gmall0401.user.controller;


import com.atguigu.gmall0401.bean.UserInfo;
import com.atguigu.gmall0401.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("allUsers")
    public List<UserInfo> getAllUsers() {
        List<UserInfo> list = userService.getUserInfoListAll();
        return list;

    }

    @PostMapping("addUser")
    public String addUser(UserInfo userInfo) {

        userService.addUser(userInfo);
        return "success";

    }
}
