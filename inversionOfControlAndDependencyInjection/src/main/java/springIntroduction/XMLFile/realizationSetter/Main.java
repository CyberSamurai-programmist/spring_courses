package springIntroduction.XMLFile.realizationSetter;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("configXMLFile/applicationContextSetter.xml");

        Person person = context.getBean("myPerson", Person.class);
        person.callYourPet();

        System.out.println("Passing values to fields: ");
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        context.close();
    }
}
