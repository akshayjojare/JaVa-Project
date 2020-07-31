package com.app.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.Dao.StudentDao;
import com.app.studentbean.User;

/**
 * Servlet implementation class loginServlet
 */
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String User_Name=request.getParameter("User_Name");
		
		String Password=request.getParameter("password");
		
		User u=new User();
		
		u.setUser_Name(User_Name);
		u.setPassword(Password);
		
		 if(StudentDao.checkUser(u))
	        {
	            RequestDispatcher rs = request.getRequestDispatcher("welcome.html");
	            
	            rs.forward(request, response);
	            
	        }
	        else
	        {
	          
	           RequestDispatcher rs = request.getRequestDispatcher("Login.html");
	           rs.include(request, response);
	           
	           out.println("Username or Password incorrect");
	        }
	    } 		
	}


