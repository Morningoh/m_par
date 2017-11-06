package com.shsxt.service;

import com.shsxt.dao.UserDao;

/**
 * Created by pc on 2017/11/6.
 */
public class UserService {
    private UserDao userDao = new UserDao();
    public void save(String userName,String password){
        userDao.save(userName,password);
        System.out.println("Service层:userName"+userName+"password"+password);
    }
}
