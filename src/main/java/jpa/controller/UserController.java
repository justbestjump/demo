package jpa.controller;

import jpa.pojo.User;
import jpa.pojo.User1;
//import jpa.service.UserService;
import jpa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.util.List;

@Controller
public class UserController {
//    @Autowired
//    UserService userService;
//    @RequestMapping("/test")
//    @ResponseBody
//    public List<User1> queryAll() throws IOException {
//        return userService.queryAll();
//
//    }

    @Autowired
    private UserService userService;

    /**
     * 查询所有用户信息
     * @return
     */
    @RequestMapping(path = "/test")
    @ResponseBody
    public List<User> findAll() {
        List<User> users = userService.findAll();
        return users;
    }
}

