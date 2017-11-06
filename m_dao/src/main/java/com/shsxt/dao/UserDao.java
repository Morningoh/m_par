package com.shsxt.dao;

/**
 * Created by pc on 2017/11/6.
 */
public class UserDao {
    public void save(String userName,String password){
        System.out.println("Dao层 :userName :"+userName+":password:"+password);
    }
}
