import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.internal.SessionFactoryServiceRegistryBuilderImpl;
import org.hibernate.SessionFactory;
import org.hibernate.Session;

public class Hibernate {
	public static void main(String[] args){
		
		Job person = new Job();
		
//		person.setId(90); 
//		person.setFname("Muhammad");
//		person.setLname("Usman");
//		person.setDepartment("Engineering");
//		person.setSalary(66000);
		
		Configuration config = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Job.class);
//		ServiceRegistry reg = new SessionFactoryServiceRegistryBuilderImpl()
//				.applySettings(config.getProperties()).buildServiceRegistry();
		SessionFactory sf = config.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
//		session.save(person); //saving data in database
		person=(Job)session.get(Job.class, 70); //fetching data from database
		tx.commit();
		System.out.println(person);
		
	}

}
