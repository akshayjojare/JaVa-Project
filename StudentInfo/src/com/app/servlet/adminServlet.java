package com.app.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.Dao.StudentDao;
import com.app.studentbean.Admin;
import com.app.studentbean.User;

/**
 * Servlet implementation class loginServlet
 */
public class adminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public adminServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String User_Name=request.getParameter("User_Name");
		
		String Password=request.getParameter("password");
		
		Admin ad=new Admin();
		
		ad.setAdminUserName(User_Name);
		ad.setAdminpassword(Password);
		
		 if(StudentDao.checkAdmin(ad))
	        {
	            RequestDispatcher rs = request.getRequestDispatcher("viewinfo.html");
	            
	            rs.forward(request, response);
	            
	        }
	        else
	        {
	          
	           RequestDispatcher rs = request.getRequestDispatcher("Admin.html");
	           rs.include(request, response);
	           
	           out.println("Username or Password incorrect");
	        }
	    } 		
	}


