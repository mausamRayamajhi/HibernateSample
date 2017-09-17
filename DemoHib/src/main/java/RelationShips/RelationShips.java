package RelationShips;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.mausam.DemoHib.Alien;

public class RelationShips {

	public static void main(String[] args) {
		
		Laptop l= new Laptop();
		l.setLid(101);
		l.setLname("Hp");
		
		Student s= new Student();
		s.setMark(100);
		s.setName("Mausam RAyamajhi");
		s.setRollno(1);
		s.getLaptop().add(l);
		s.getLaptop().add(l);
		l.getStudent().add(s);
		
		
		Configuration con = new Configuration().configure().addAnnotatedClass(Laptop.class).addAnnotatedClass(Student.class);

		ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();

		SessionFactory sf = con.buildSessionFactory(reg);

		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();

		session.save(l);
		session.save(s);
	

		tx.commit();

	
	}

}
