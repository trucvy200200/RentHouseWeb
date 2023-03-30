/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.scrumteam.dao.impl;

import com.scrumteam.mapper.HouseMapper;
import com.scrumteam.model.HouseModel;
import java.util.List;



/**
 *
 * @author ADMIN
 */
public class HouseDAO extends AbstractDAO<HouseModel> {
    public List<HouseModel> showHouse()
    {
        String query = "Select * from house";
        return query(query, new HouseMapper());
    }
}
