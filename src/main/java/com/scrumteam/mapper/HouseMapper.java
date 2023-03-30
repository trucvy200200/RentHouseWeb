/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.scrumteam.mapper;

import com.scrumteam.model.HouseModel;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ADMIN
 */
public class HouseMapper implements RowMapper<HouseModel>{
    @Override
    public HouseModel mapRow(ResultSet rs) {
        try {
		    HouseModel house = new HouseModel();
			house.setHouseid(rs.getInt("idhouse"));			
			house.setIduser(rs.getInt("iduser"));
			house.setTitle(rs.getString("title"));		
			house.setNumber(rs.getString("number"));
                        house.setStreet(rs.getString("street"));
                        house.setDistrict(rs.getString("district"));
                        house.setCity(rs.getString("city"));
                        house.setCost(rs.getFloat("cost"));
                        house.setDescription(rs.getString("description"));
                        house.setArea(rs.getString("area"));
                        house.setImage(rs.getString("image"));
			return house;
			}
			catch (SQLException e)
			{
				return null;
			}
    }
    
}
