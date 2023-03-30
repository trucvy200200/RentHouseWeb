/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.scrumteam.dao.impl;

import com.scrumteam.dao.iUserDAO;
import com.scrumteam.mapper.UserMapper;
import com.scrumteam.model.UserModel;
import java.util.List;

/**
 *
 * @author ACER
 */
public class UserDAO  extends AbstractDAO<UserModel> implements iUserDAO{

    @Override
    public Integer insertUser(UserModel user) {
        String sql="Insert into User(name, email, pwd, phone) values(?, ?, ?, ?)";
        return insert(sql, user.getName(),  user.getEmail(),  user.getPwd(), 
			user.getPhone());
    }

    @Override
    public UserModel findUserByPass(String user, String pass) {
       String sql="Select * from user where email=? and pwd=?";
		List<UserModel> list= query(sql, new UserMapper(), user, pass);
		return list.isEmpty()? null : list.get(0);
    }
    
}
