package springIntroduction.XMLFile.realizationConstructor;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("configXMLFile/applicationContextConstructor.xml");

        Person person = context.getBean("myPerson", Person.class);
        person.callYourPet();

        context.close();
    }
}
