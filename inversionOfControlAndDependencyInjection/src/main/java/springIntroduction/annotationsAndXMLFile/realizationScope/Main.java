package springIntroduction.annotationsAndXMLFile.realizationScope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("configAnnotationsAndXMLFIle/applicationContextScope.xml");

        Dog myDog = context.getBean("dogBean", Dog.class);
        myDog.say();

        Dog yourDog = context.getBean("dogBean", Dog.class);
        yourDog.say();

        System.out.println("Переменные ссылаются на один и тот же объект ? " +
                (myDog == yourDog));

        System.out.println(myDog);
        System.out.println(yourDog);


        Cat myCat = context.getBean("catBean", Cat.class);
        myCat.say();

        Cat yourCat = context.getBean("catBean", Cat.class);
        yourCat.say();

        System.out.println("Переменные ссылаются на один и тот же объект ? " +
                (myCat == yourCat));

        System.out.println(myCat);
        System.out.println(yourCat);

        context.close();
    }
}
