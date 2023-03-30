/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.scrumteam.controller.web;

import java.io.IOException;
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
    protected void doGet(HttpServletRequest request,  HttpServletResponse response) throws ServletException, IOException 
	{ 
            RequestDispatcher rd=request.getRequestDispatcher("/views/home.jsp");
            rd.forward(request, response);
        }
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)  throws ServletException, IOException 
	{
        
        }
}
