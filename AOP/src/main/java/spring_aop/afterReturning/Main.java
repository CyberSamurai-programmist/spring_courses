package spring_aop.afterReturning;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(spring_aop.MyConfig.class);

        University university = context.getBean("university", University.class);
        university.addStudent();
        try {
            List<Student> studentList = university.getStudents();
            System.out.println(studentList);
        } catch (Exception e) {
            System.out.println("Было поймано исключение " + e);
        }

        context.close();
    }
}
