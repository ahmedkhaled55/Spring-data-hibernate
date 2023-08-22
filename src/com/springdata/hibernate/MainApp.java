package com.springdata.hibernate;

import java.sql.Connection;
import java.sql.DriverManager;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/employe?allowPublicKeyRetrieval=true&useSSL=false ";
		String username ="root";
		String password ="ahmed";
		
		
		
		try{
			
			Connection connection = DriverManager.getConnection(
					
		url,username,password
					);
			System.out.println("connected ");
			System.out.println(connection);
		}
		catch(Exception e) {
			System.out.println(e.toString());
		}
		
	}

}
