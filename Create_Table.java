package com.myjdbc.com;

import java.sql.Connection;
import java.sql.Statement;
public class Create_Table {

      public static void main(String[] args) {
    	  Connection connection = null;
    	  
    	  Statement statement=null;
    	  ConnectDB obj_ConnectDB= new ConnectDB();
    	  
    	  connection = obj_ConnectDB.get_connection();
    	  
    	  
    	  try {
    		  
    		  String query="create table employee(eid Integer primary key,ename varchar(20),place varchar(20))";
    		  statement=connection.createStatement();
    		  statement.executeUpdate(query);
    		  System.out.println("table Created Successful");
    	  }
    	  catch(Exception e) {
    		  e.printStackTrace();
    	  }
      }
	
	
}
