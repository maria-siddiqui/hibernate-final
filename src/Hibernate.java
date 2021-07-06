import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.internal.SessionFactoryServiceRegistryBuilderImpl;
import org.hibernate.SessionFactory;
import org.hibernate.Session;

public class Hibernate {
	public static void main(String[] args){
		
		Job person = new Job();
		
//		person.setId(50); 
//		person.setFname("Huma");
//		person.setLname("Karim");
//		person.setDepartment("Admin");
//		person.setSalary(45000);
		
		Configuration config = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Job.class);
//		ServiceRegistry reg = new SessionFactoryServiceRegistryBuilderImpl()
//				.applySettings(config.getProperties()).buildServiceRegistry();
		SessionFactory sf = config.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.save(person);
		person=(Job)session.get(Job.class, 50);
		tx.commit();
		System.out.println(person);
		
	}

}
