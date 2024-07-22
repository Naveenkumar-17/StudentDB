package com.Crud.Sudentapp;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
public class StudentDBimpl implements StudentDBInt {
	   Scanner in=new Scanner(System.in);
//	   Student s=new Student();
       Connection con=DBconnection.createDBconnection();
	   @Override
       public void create(Student s) {
           String q="Insert into student values(?,?,?,?)";
    	   try {
           PreparedStatement pstm=con.prepareStatement(q);
           pstm.setInt(2,s.getRoll() );
           pstm.setString(1, s.getName());
           pstm.setInt(3, s.getAge());
           pstm.setFloat(4, s.getMarks());
           int count=pstm.executeUpdate();
           if(count!=0) {
    	   System.out.println("Created Successfully!...");
       }
    	   }
    	   catch(Exception e) {
    		   e.printStackTrace();
    	   }
    	   }
       @Override
       public void showAll() {
    	   System.out.println("---------------Details----------------------");
    	   con=DBconnection.createDBconnection();
    	   String q="Select * from student";
    	   try {
    	   Statement stmt=con.createStatement();
    	   ResultSet rs=stmt.executeQuery(q);
    	   while(rs.next()) {
    		   System.out.printf("%d \t %s \t %d \t%f \n",rs.getInt(2),rs.getString(1),rs.getInt(3),rs.getFloat(4));
    	   }
    	   
 //    	   pstm.get
    	   }
    	   catch(Exception e) {
    		   e.printStackTrace();
    	   }
    	   
       }
       @Override
       public void showbyID(int r) {
    	con=DBconnection.createDBconnection();
    	try {
    		String q="Select * from student where Rollno="+r;
    		 
    		Statement stmt=con.createStatement();
    		ResultSet rs=stmt.executeQuery(q);
    		while(rs.next()) {
    			System.out.printf("%d \t %s \t %d \t%f \n",rs.getInt(2),rs.getString(1),rs.getInt(3),rs.getFloat(4));
    		}
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    	}
       }
       @Override
       public void update(int r) {
    	   con=DBconnection.createDBconnection();
       	try {
       		String q="Select * from student where Rollno="+r;
       		 
       		Statement stmt=con.createStatement();
       		ResultSet rs=stmt.executeQuery(q);
       		while(rs.next()) {
       			System.out.printf("%d \t %s \t %d \t%f \n",rs.getInt(2),rs.getString(1),rs.getInt(3),rs.getFloat(4));
       		}
       	}
       	catch(Exception e) {
       		e.printStackTrace();
       	}
       }
       @Override
       public void delete(int r) {
    	   con=DBconnection.createDBconnection();
       	try {
       		String q="delete  from student where Rollno="+r;
       		PreparedStatement pstm=con.prepareStatement(q);
       		int count=pstm.executeUpdate();
       		if(count!=0) {
       			System.out.println("Deleted Successfully!....");
       		}
       	 
       		
       	}
       	catch(Exception e) {
       		e.printStackTrace();
       	}
    	   
       }
       
}
