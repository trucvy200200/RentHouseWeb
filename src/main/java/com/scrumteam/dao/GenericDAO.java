/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.scrumteam.dao;

import com.scrumteam.mapper.RowMapper;
import java.util.List;

/**
 *
 * @author ACER
 */
public interface GenericDAO<T>  {
    <T>List<T> query(String sql, RowMapper<T> rowMapper, Object... parameters);
    Integer insert (String sql, Object...parameters);
}
