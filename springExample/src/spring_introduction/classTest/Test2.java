package spring_introduction.classTest;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring_introduction.interfacePet.Pet;

public class Test2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Pet pet = context.getBean("myPet", Pet.class);
        pet.say();

        context.close();
    }
}
