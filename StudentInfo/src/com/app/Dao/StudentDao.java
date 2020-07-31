package com.app.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.app.studentbean.Admin;
import com.app.studentbean.Student;
import com.app.studentbean.User;

public class StudentDao {
	
	public static Connection getConnection() {
		
		Connection con=null;
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql:// localhost:3306/userlogin","root","system");
			
			
		}catch(Exception e) {
			
			
			System.out.println(e);
		}
		return con;
		
	}

	public static int save(Student studentpojo) {
		// TODO Auto-generated method stub
		int status=0;
		
		try {
			
			Connection con=StudentDao.getConnection();
			
			PreparedStatement prepareStatement=con.prepareStatement( "insert into studentinfo(First_Name,Middle_Name,Last_Name,Email,Mob_Numbers,Stream) values (?,?,?,?,?,?)");
			
			prepareStatement.setString(1,studentpojo.getFirst_Name());
			prepareStatement.setString(2,studentpojo.getLast_Name());
			prepareStatement.setString(3,studentpojo.getMiddle_Name());
			prepareStatement.setString(4,studentpojo.getEmail());
			prepareStatement.setString(5,studentpojo.getMob_Number());
			prepareStatement.setString(6,studentpojo.getStream());
			
			status=prepareStatement.executeUpdate();  
	           
	         con.close(); 
		}catch(Exception e) {
			
			
			System.out.println(e);
		}
		return status;
	}
	
	public static boolean checkUser(User u) {
		// TODO Auto-generated method stub
		
				boolean status=false;
		
		try {
			
			Connection con=StudentDao.getConnection();
			
			PreparedStatement prepareStatement=con.prepareStatement( "select * from user where User_Name=? and password=? ");
			
			
			
			
			prepareStatement.setString(1, u.getUser_Name());
			prepareStatement.setString(2, u.getPassword());
			
	         ResultSet rs =prepareStatement.executeQuery();

	         while (rs.next()) {

					status = true;

				}
		
		
	}catch(Exception e) {
		
		
		System.out.println(e);
	}
		return status;
	}


public static boolean checkAdmin(Admin d) {
	// TODO Auto-generated method stub
	
			boolean status=false;
	
	try {
		
		Connection con=StudentDao.getConnection();
		
		PreparedStatement prepareStatement=con.prepareStatement( "select * from user where User_Name=? and password=? ");
		
		
		
		
		prepareStatement.setString(1, d.getAdminUserName());
		prepareStatement.setString(2, d.getAdminpassword());
		
         ResultSet rs =prepareStatement.executeQuery();

         while (rs.next()) {

				status = true;

			}
	
	
		}catch(Exception e) {
	
	
	System.out.println(e);
				}
				return status;
			}

			public static List<Student>getAllEmployees(){
				
				
				List <Student>list=new ArrayList(); 
				
				try {
					
					Connection con=StudentDao.getConnection();
					
					PreparedStatement ps=con.prepareStatement("select * from studentinfo"); 
					
					
					ResultSet rs=ps.executeQuery();  
		            while(rs.next()){  
		                Student s=new Student();  
		                s.setId(rs.getInt(1));
		                s.setFirst_Name(rs.getString(2));  
		                s.setMiddle_Name(rs.getString(3));  
		                s.setLast_Name(rs.getString(4));  
		                s.setEmail(rs.getString(5));  
		                s.setMob_Number(rs.getString(6)); 
		                s.setStream(rs.getString(7));
		                list.add(s);  
		            }  
		            con.close();  
		        }catch(Exception e){e.printStackTrace();}  
		          
		        return list;  
		    }  


}
