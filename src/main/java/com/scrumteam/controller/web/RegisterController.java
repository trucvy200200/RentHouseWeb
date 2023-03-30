/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.scrumteam.controller.web;

import com.scrumteam.model.UserModel;
import com.scrumteam.service.iUserService;
import com.scrumteam.utils.MessageUtil;
import java.io.IOException;

import javax.inject.Inject;
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
@WebServlet(urlPatterns = {"/register"})
public class RegisterController extends HttpServlet {

    private static final long serialVersionUID = 1L;
    @Inject
    private iUserService userService;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action != null && action.equals("register")) {
            UserModel user = new UserModel();
            user.setName(request.getParameter("name"));
            user.setPhone(request.getParameter("phone"));
            String password = request.getParameter("password");
            String conf = request.getParameter("confirmPassword");
            user.setPwd(password);
            user.setEmail(request.getParameter("email"));
            if (conf.equals(password)) {
                userService.insertUser(user);
                MessageUtil.showMessage(request);
                RequestDispatcher rd = request.getRequestDispatcher("/views/pages/log/register.jsp");
                rd.forward(request, response);
            } else {
                request.setAttribute("messageResponse", "Confirm password failed!");
                request.setAttribute("alert", "danger");
                RequestDispatcher rd = request.getRequestDispatcher("/views/pages/log/register.jsp");
                rd.forward(request, response);
            }
        }
    }
}
