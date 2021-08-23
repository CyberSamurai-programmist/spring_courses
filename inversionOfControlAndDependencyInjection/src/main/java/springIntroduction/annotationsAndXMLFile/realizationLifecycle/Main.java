package springIntroduction.annotationsAndXMLFile.realizationLifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("configAnnotationsAndXMLFIle/applicationContextLifecycle.xml");

        Dog myDog = context.getBean("dogBean", Dog.class);
        myDog.say();

        Cat myCat = context.getBean("catBean", Cat.class);
        myCat.say();


        context.close();
    }
}
