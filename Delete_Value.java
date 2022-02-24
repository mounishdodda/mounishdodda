package com.myjdbc.com;

import java.sql.Connection;
import java.sql.Statement;

import java.sql.Connection;

public class Delete_Value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Connection connection = null;
	   	  
	   	  Statement statement=null;
	   	  
	   	  ConnectDB obj_ConnectDB= new ConnectDB();
	   	  
	   	  connection = obj_ConnectDB.get_connection();
	   	  
	   	  
	   	  try {
	   		  
	   		  String query="Delete from employee where eid=5";
	   		  statement=connection.createStatement();
	   		  statement.executeUpdate(query);
	   		  System.out.println("Deletion Succesful");
	   	  }
	   	  catch(Exception e) {
	   		  e.printStackTrace();
	   	  }
			
		
		
		
		
		
	}

}
