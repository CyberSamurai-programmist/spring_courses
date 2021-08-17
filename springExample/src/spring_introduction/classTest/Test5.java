package spring_introduction.classTest;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring_introduction.classPet.Dog;

public class Test5 {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");

        Dog myDog = context.getBean("myPet", Dog.class);
        myDog.say();

        Dog youDog = context.getBean("myPet", Dog.class);
        youDog.say();

        context.close();
    }
}
