package hibernate;

import hibernate.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainInsertAndSelect {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            Employee emp = new Employee("OLeg", "Sidorov",
                    "HR", 700);
            session.beginTransaction();
            session.save(emp); // INSERT
            session.getTransaction().commit();

            int myId = emp.getId();
            session = factory.getCurrentSession();
            session.beginTransaction();

            Employee employee = session.get(Employee.class, myId); // SELECT
            session.getTransaction().commit();
            System.out.println(employee);

            System.out.println("Done!");
        } finally {
            factory.close();
        }
    }
}
