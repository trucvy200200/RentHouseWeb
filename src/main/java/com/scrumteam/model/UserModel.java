/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.scrumteam.model;

/**
 *
 * @author ACER
 */
public class UserModel {
    private Integer id;
    private String name;
    private String email;
    private String pwd;
    private String phone;

    public UserModel() {
    }

    public UserModel(Integer id, String name, String email, String pwd, String phone) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.pwd = pwd;
        this.phone = phone;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
   
}
