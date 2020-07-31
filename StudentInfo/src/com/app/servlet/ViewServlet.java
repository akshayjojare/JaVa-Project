package com.app.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.Dao.StudentDao;
import com.app.studentbean.Student;
 
public class ViewServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		out.println("<h1>Student List</h1>");
		
		List<Student> list=StudentDao.getAllEmployees();
			  out.println("<table border='1'>");
			  out.print("<tr><th>Id</th><th>First_Name</th><th>Middle_Name</th><th>LastName</th><th>Email</th><th>Mob_Number</th><th>Stream</th><th>Approved<th></tr>");
				for(Student s:list){
					

					
					out.print("<tr><td>"+s.getId()+"</td><td>"+s.getFirst_Name()+"</td><td>"+s.getMiddle_Name()+"</td><td>"+s.getLast_Name()+"</td><td>"+s.getEmail()+"</td><td>"+s.getMob_Number()+"</td><td>"+s.getStream()+"</td><td><a href ='ApprovedServlet'</td></tr>");	
				}
				
				out.print("</table>");
				
				out.close();
			  
			  
			 
			
			  
			  out.println("</body>");
			  out.println("</html>");
		
			  
		
		
//		out.print("<table border='1' width='100%'");
//		
//		out.print("<tr><th>Id</th><th>First_Name</th><th>Middle_Name</th><th>LastName</th><th>Email</th><th>Mob_Number</th><th>Stream</th></tr>");
//		for(Student s:list){
//			
//
//				out.print("<tr><td>"+s.getId()+"</td><td>"+s.getFirst_Name()+"</td><td>"+s.getMiddle_Name()+"</td><td>"+s.getLast_Name()+"</td><td>"+s.getEmail()+"</td><td>"+s.getMob_Number()+"</td><td>"+s.getStream()+"</td></tr>");	
//		}
//		
//		out.print("</table>");
//		
//		out.close();
	}
}
