package com.app.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.Dao.StudentDao;
import com.app.studentbean.Student;


public class SaveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public SaveServlet() {
        // TODO Auto-generated constructor stub
    }

		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			
			String First_Name=request.getParameter("First_Name");
			String Middle_Name=request.getParameter("Middle_Name");
			String Last_Name=request.getParameter("Last_Name");
			String Email=request.getParameter("Email");
			
			String Mob_Number=request.getParameter("Mob_Number");
			
			String Stream=request.getParameter("Stream");
			
			Student studentpojo=new Student();
			
			studentpojo.setFirst_Name(First_Name);
			studentpojo.setMiddle_Name(Middle_Name);
			studentpojo.setLast_Name(Last_Name);
			studentpojo.setEmail(Email);
			studentpojo.setMob_Number(Mob_Number);
			studentpojo.setStream(Stream);
			
			
			int status=StudentDao.save(studentpojo);
			
			
			if(status>0){
				
				request.getRequestDispatcher("Register.html").include(request, response);
				
				out.print("<p>Record saved successfully!</p>");
			}else{
				
				out.println("Sorry! unable to save record");
			}
			
			out.close();
		}

}