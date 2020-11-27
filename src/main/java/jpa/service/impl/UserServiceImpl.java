package jpa.service.impl;


import jpa.dao.UserMapper;
import jpa.pojo.User;
import jpa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

//import jpa.dao.UserDao;
//import jpa.pojo.User1;
//import jpa.service.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//@Service
//public class UserServiceImpl implements UserService {
//    @Autowired
//    UserDao userDao;
//    @Override
//    public List<User1> queryAll() {
//        return  userDao.findAll();
//    }
//}
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    @Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
    public List<User> findAll() {
        return userMapper.selectAll();
    }
}
