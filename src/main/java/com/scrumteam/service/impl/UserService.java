/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.scrumteam.service.impl;

import com.scrumteam.dao.iUserDAO;
import com.scrumteam.model.UserModel;
import com.scrumteam.service.iUserService;
import java.sql.Timestamp;
import javax.inject.Inject;

/**
 *
 * @author ACER
 */
public class UserService implements iUserService {

    @Inject
    private iUserDAO userDAO;

    @Override
    public UserModel findUserByPass(String user, String pass) {
        return userDAO.findUserByPass(user, pass);
    }

    @Override
    public void insertUser(UserModel user) {
        Integer id = userDAO.insertUser(user);
        System.out.print(id);
    }

}
