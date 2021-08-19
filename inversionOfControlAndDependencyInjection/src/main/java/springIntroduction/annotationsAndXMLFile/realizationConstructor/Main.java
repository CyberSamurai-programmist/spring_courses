package springIntroduction.annotationsAndXMLFile.realizationConstructor;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("configAnnotationsAndXMLFIle/applicationContextConstructor.xml");

        Person person = context.getBean("personBean",Person.class);
        person.callYourPet();

        System.out.println(person.getName());
        System.out.println(person.getAge());

        context.close();
    }
}
