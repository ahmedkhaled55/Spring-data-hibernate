package com.springdata.hibernate;

import java.sql.Connection;
import java.sql.DriverManager;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.springdata.hibernate.model.client;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")			
				.addAnnotatedClass(client.class)
				.buildSessionFactory();
		
		
		Session session = factory.getCurrentSession();
		
		
		
	}

}



/*

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
*/
