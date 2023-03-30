/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.scrumteam.controller.web;

import com.scrumteam.dao.impl.HouseDAO;
import com.scrumteam.model.HouseModel;
import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ACER
 */
@WebServlet(urlPatterns={"/home", "/login", "/logout"})
public class HomeController extends HttpServlet{
    
    private static final String defaultURL = "/views/home.jsp";
    
    protected void doGet(HttpServletRequest request,  HttpServletResponse response) throws ServletException, IOException 
	{  
            String requestURI = request.getRequestURI();
            String url = defaultURL;
            url = setHouseToInterface(request, response);
            RequestDispatcher rd=request.getRequestDispatcher("/views/home.jsp");
            rd.forward(request, response);
        }
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)  throws ServletException, IOException 
	{
        
        }
    
    private String setHouseToInterface(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        HouseDAO getHouse = new HouseDAO();
        List<HouseModel> list = getHouse.showHouse();
//        for(HouseModel h : list){
//            log("house: ", h.getDescription());
//        }
        request.setAttribute("list", list);
        return defaultURL;
    }
}
