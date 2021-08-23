package springIntroduction.javaCode.realizationComponentScan;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Person person = context.getBean("Person", Person.class);
        person.callYourPet();

        System.out.println(person.getName());
        System.out.println(person.getAge());

        context.close();

    }
}
