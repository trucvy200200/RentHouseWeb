package com.scrumteam.controller.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import com.scrumteam.dao.impl.UserDAO;
import com.scrumteam.model.UserModel;

@WebServlet(name = "LoginServlet", value = "/userLogin")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try(PrintWriter out = response.getWriter())
        {
            //get data : request
            String email = request.getParameter("login-email"); // get email from the login page
            String password = request.getParameter("login-password");
            try {
                UserDAO udao = new UserDAO();
                UserModel user = udao.findUserByPass(email,password); // check the account by using API

                if (user != null) {
                    request.getSession().setAttribute("auth",user);
                    response.sendRedirect("index.jsp");
                } else {
                    out.println("user login failed");
                }
            }catch (Exception e){
                e.printStackTrace();
            }


            out.println(email+password);

        }
    }
}
