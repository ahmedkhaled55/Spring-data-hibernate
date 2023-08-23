package com.springdata.hibernate;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mysql.cj.protocol.x.SyncFlushDeflaterOutputStream;
import com.springdata.hibernate.model.Client;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")			
				.addAnnotatedClass(Client.class)
				.buildSessionFactory();
		Session session = factory.getCurrentSession();
		long id = 1;
		
		
		
		
		try {
			session.beginTransaction();
			/*	Client client = session.get(Client.class, id);
				
				client.setFullName("omar");
				client.setAddress("estanha");
				client.setAge(16);
				*/
				/*Client c = new Client("maz",4,"qal");
				c.setId((long) 2);
				
				session.update(c);
				*/
				
				Client c = new Client();
				c.setId((long) 1);
				session.delete(c);
				
			session.getTransaction().commit();
		//	System.out.println(c.getFullName() + " " + c.getAddress() + " " + c.getAge());
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.toString());
		} finally {
			session.close();
		}
		
		
		
	}

}

/*
		
		Client client1 = new Client("ahmed khaled",26,"benha");
		//client1.setId((long) 1);
		
		Client client2 = new Client("ahmed khaled",26,"benha");
		//client2.setId((long) 2);
		
		Client client3 = new Client("ahmed khaled",26,"benha");
		//client3.setId((long) 3);
		 * 
		 * 
		 * 
		 * 
		 * 	session.save(client1);		
			session.save(client2);		
			session.save(client3);
		 
		  */







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
