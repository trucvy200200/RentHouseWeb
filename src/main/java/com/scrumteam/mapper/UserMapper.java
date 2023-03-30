/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.scrumteam.mapper;

import com.scrumteam.model.UserModel;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ACER
 */
public class UserMapper implements RowMapper<UserModel> {

    @Override
    public UserModel mapRow(ResultSet rs) {
        try {
		    UserModel user = new UserModel();
			user.setId(rs.getInt("iduser"));			
			user.setEmail(rs.getString("email"));
			user.setPhone(rs.getString("phone"));		
			user.setName(rs.getString("name"));
                        user.setPwd(rs.getString("pwd"));
			return user;
			}
			catch (SQLException e)
			{
				return null;
			}
    }
    
}
