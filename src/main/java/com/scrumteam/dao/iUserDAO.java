/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.scrumteam.dao;

import com.scrumteam.model.UserModel;

/**
 *
 * @author ACER
 */
public interface iUserDAO {
    UserModel findUserByPass(String user, String pass) ;
    Integer insertUser(UserModel user);
}
