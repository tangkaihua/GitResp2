package com.itheima.controller;

import com.itheima.dao.UserDao;
import com.itheima.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author tangkaihua
 * @create 2020-05-30-11:25
 */
@RestController
public class UserController {
    @Autowired
    private UserDao userDao;

    @RequestMapping("/queryuserlist")
    public List<User> queryUserList(){
        return userDao.queryUserList();
    }
}
