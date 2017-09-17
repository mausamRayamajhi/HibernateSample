package Casing;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.mausam.DemoHib.Alien;
import com.mausam.DemoHib.AlienFullName;
import com.mausam.DemoHib.FatherMotherName;

import RelationShips.Laptop;
import RelationShips.Student;

public class Casing {

	public static void main(String[] args) {
		

	/*	FatherMotherName fmName= new FatherMotherName();
		fmName.setFatherName("Krishna Kumar Rayamajhi");
		fmName.setMotherName("Maiya Rayamajhi");
	
		
		AlienFullName name= new AlienFullName();
		name.setFname("ALija");
		name.setLname("Rayamajhi");
		name.setMname("Kumar");
		name.setFmName(fmName);*/
		
		Alien obj = new Alien();
		
	/*	obj.setAid(103);
		obj.setColor("Red");
		obj.setAname(name);*/
		
		Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class);

		ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();

		SessionFactory sf = con.buildSessionFactory(reg);

		/*==============================================================================*/
		
		Session session = sf.openSession();        //1st session
		Transaction tx = session.beginTransaction();

		/*session.save(obj);*/
		
		//obj=(Alien)session.get(Alien.class, 101);
		//System.out.println(obj.getAname().getFname());
		
		
		Query sql=session.createQuery("from Alien where aid=101");
		sql.setCacheable(true);
		
		obj=(Alien)sql.uniqueResult();
		System.out.println(obj.getAname().getFname());
		
		tx.commit();
		session.close();
		
		/*================================================================================*/
		
		Session session2 = sf.openSession();		//2nd session
		Transaction tx2 = session2.beginTransaction();
		
		//obj=(Alien)session2.get(Alien.class, 101);
		//System.out.println(obj.getAname().getFname());
		
		Query sql2=session2.createQuery("from Alien where aid=101");
		sql2.setCacheable(true);
		
		obj=(Alien)sql2.uniqueResult();
		System.out.println(obj.getAname().getFname());
		
		
		tx2.commit();
		session2.close();
		
		/*=================================================================================*/
	}

}
