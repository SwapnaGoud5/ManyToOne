package manytoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class App 
{
    public static void main( String[] args )
    {
    	// Obtain a Hibernate SessionFactory
        SessionFactory factory = HibernateUtil.getSessionFactory();
        // Open a new session
        Session session = factory.openSession();
        // Begin a transaction
        Transaction t = session.beginTransaction();
        
        Department dept = new  Department();
        dept.setName("Accounted");
        
        Employees emp1 = new  Employees();
        emp1.setName("supriya");
        emp1.setDept(dept);
        dept.getEmployees().add(emp1);
        
        Employees emp2 = new  Employees();
        emp2.setName("supriya");
        emp2.setDept(dept);
        dept.getEmployees().add(emp2);

        session.persist(dept);
        
        t.commit();
        session.close();
        factory.close();


    }
}
