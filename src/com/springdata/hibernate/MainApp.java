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
		
		Client client1 = new Client("ahmed khaled",26,"benha");
		//client1.setId((long) 1);
		
		Client client2 = new Client("ahmed khaled",26,"benha");
		//client2.setId((long) 2);
		
		Client client3 = new Client("ahmed khaled",26,"benha");
		//client3.setId((long) 3);
		
		
		try {
			session.beginTransaction();
			session.save(client1);		
			session.save(client2);		
			session.save(client3);		
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
