package springIntroduction.XMLFile.realizationBean;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("configXMLFile/applicationContextBean.xml");

        Pet myCat = context.getBean("myCat",Pet.class);
        myCat.say();

        Pet myDog = context.getBean("myDog", Pet.class);
        myDog.say();

        context.close();
    }
}
