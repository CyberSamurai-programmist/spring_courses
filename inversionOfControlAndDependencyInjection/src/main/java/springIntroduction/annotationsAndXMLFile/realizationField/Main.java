package springIntroduction.annotationsAndXMLFile.realizationField;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("configAnnotationsAndXMLFIle/applicationContextField.xml");

        Person person = context.getBean("mPerson", Person.class);
        person.callYourPet();

        System.out.println(person.getName());
        System.out.println(person.getAge());

        context.close();
    }
}
