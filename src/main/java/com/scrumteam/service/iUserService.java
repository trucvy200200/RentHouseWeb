/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.scrumteam.service;

import com.scrumteam.model.UserModel;

/**
 *
 * @author ACER
 */
public interface iUserService {
    UserModel findUserByPass(String user, String pass);
    void insertUser(UserModel user);
}
