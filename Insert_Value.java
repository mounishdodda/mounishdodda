package com.myjdbc.com;

import java.sql.Connection;
import java.sql.Statement;

public class Insert_Value {

	public static void main(String[] args) {
		
      Connection connection = null;
   	  
   	  Statement statement=null;
   	  
   	  ConnectDB obj_ConnectDB= new ConnectDB();
   	  
   	  connection = obj_ConnectDB.get_connection();
   	  
   	  
   	  try {
   		  
   		  String query="insert into employee values(5,'Ajay','Kolkata')";
   		  statement=connection.createStatement();
   		  statement.executeUpdate(query);
   		  System.out.println("Insertion Successful");
   	  }
   	  catch(Exception e) {
   		  e.printStackTrace();
   	  }
		
		

	}

}
