package com.Crud.Sudentapp;
import java.util.Scanner;
public class Main {
    
	public static void main(String[] args) {
	   StudentDBimpl st=new StudentDBimpl();
	   DBconnection db=new DBconnection();
		// TODO Auto-generated method stub
       Scanner in= new Scanner(System.in);
	   while(true) {
       System.out.println("1.Create \n"+"2.Show All \n"+"3.Show By Id \n"+"4.Update\n"+"5.Delete\n"+"6.Exit");
	   System.out.println("Enter your choice:");
	   int choice=in.nextInt();
	   
	   if(choice==6) {
		   break;
	   }
	   switch(choice) {
	   case 1:
		   Student s=new Student();
		   System.out.println("Enter Roll no:");
    	   int r=in.nextInt();
    	  
    	   System.out.println("Enter the Name:");
    	   String na=in.next();
    	  
    	   System.out.println("Enter the Age:");
    	   int a=in.nextInt();
    	 
    	   System.out.println("Enter the marks:");
    	   float m=in.nextFloat();
    	   s.setRoll(r);
    	   s.setName(na);
    	   s.setAge(a);
    	   s.setMarks(m);
		   st.create(s);
		   break;
	   case 2:
		   st.showAll();
		   
		   break;
	   case 3:
		   System.out.println("Enter Roll no:");
		   r=in.nextInt();
		   st.showbyID(r);
		   break;
	   case 4:
		   System.out.println("Enter Roll no:");
		   r=in.nextInt();
		   st.update(r);
		   break;
		     
	   case 5:
		   System.out.println("Enter Roll no:");
		   r=in.nextInt();
		   st.delete(r);
		   break;
	   default:
		   System.out.println("Invalid Selection");
		      
	   }
	}
//in.close();
}
}