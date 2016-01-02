package ma.pack.models;

import java.sql.Date;

import org.hibernate.*;
import org.hibernate.cfg.*;


public class testHibernate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory sf = new AnnotationConfiguration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		
		
		Client client0 = new Client("FARES" , "Chaymae" , "chaymae@mail.Com", "test" , "chaymae" , "root" , "f2012" , "oujda" , "062315424" , new Date(02,01,2015) );
		
		
		session.save(client0);

	}

}
