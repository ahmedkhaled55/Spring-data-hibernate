package com.springdata.hibernate;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.springdata.hibernate.model.Client;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")			
				.addAnnotatedClass(Client.class)
				.buildSessionFactory();
		
		
		Session session = factory.getCurrentSession();
		
		Client client = new Client();
		client.setId((long) 1);
		client.setFullName("ahmed khaled");
		client.setAge(26);
		client.setAddress("benha ");
		
		try {
			session.beginTransaction();
			session.save(client);		
			session.getTransaction().commit();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.toString());
		} finally {
			session.close();
		}
		
		
		
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
