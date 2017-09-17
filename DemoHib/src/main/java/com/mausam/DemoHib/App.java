package com.mausam.DemoHib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
	
		FatherMotherName fmName= new FatherMotherName();
		fmName.setFatherName("Krishna Kumar Rayamajhi");
		fmName.setMotherName("Maiya Rayamajhi");
	
		
		AlienFullName name= new AlienFullName();
		name.setFname("Mausam");
		name.setLname("Rayamajhi");
		name.setMname("Kumar");
		name.setFmName(fmName);
		
		Alien obj = new Alien();
		obj.setAid(101);
		obj.setColor("Red");
		obj.setAname(name);
		
		Configuration con = new Configuration().configure()
				.addAnnotatedClass(Alien.class);

		ServiceRegistry reg = new ServiceRegistryBuilder()
				.applySettings(con.getProperties()).buildServiceRegistry();

		SessionFactory sf = con.buildSessionFactory(reg);

		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();

		session.save(obj);

		tx.commit();

		System.out.println(obj);
	}
}
