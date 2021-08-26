package hibernate_one_to_one;

import hibernate_one_to_one.entity.Detail;
import hibernate_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainBiInsert {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();

        Session session = null;

        try {
            session = factory.getCurrentSession();

            Employee employee = new Employee("Nikolay", "Ivanov",
                    "HR", 650);
            Detail detail = new Detail("London", "9765876",
                    "nikolay@gmail.com");
            employee.setEmpDetail(detail); // необходим, иначе в FK будет null
            detail.setEmployee(employee);

            session.beginTransaction();
            session.save(detail);

            session.getTransaction().commit();
            System.out.println("Done!");
        } finally {
            session.close();
            factory.close();
        }
    }
}
