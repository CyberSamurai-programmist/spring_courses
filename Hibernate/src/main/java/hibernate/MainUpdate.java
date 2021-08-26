package hibernate;

import hibernate.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainUpdate {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try{
            Session session = sessionFactory.getCurrentSession();
            session.beginTransaction();
//            Employee employee = session.get(Employee.class,1);
//            employee.setSalary(750); // UPDATE
            session.createQuery("update Employee set salary=1000 " +
                    "where name = 'Aleksandr'").executeUpdate(); // UPDATE

            session.getTransaction().commit();

            System.out.println("Done!");

        }finally {
            sessionFactory.close();
        }
    }
}
