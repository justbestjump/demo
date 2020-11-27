package jpa.service;

import jpa.pojo.User;
import jpa.pojo.User1;

import java.util.List;
//
//public interface  UserService {
//    List<User1> queryAll();
//}
public interface UserService {

    /**
     * 查询所有用户信息
     * @return
     */
    public List<User> findAll();
}
