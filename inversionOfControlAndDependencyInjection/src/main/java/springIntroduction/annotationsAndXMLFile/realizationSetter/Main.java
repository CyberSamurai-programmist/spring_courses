package springIntroduction.annotationsAndXMLFile.realizationSetter;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("configAnnotationsAndXMLFIle/applicationContextSetter.xml");

        Person person = context.getBean("Person", Person.class);
        person.callYourPet();

        context.close();
    }
}
