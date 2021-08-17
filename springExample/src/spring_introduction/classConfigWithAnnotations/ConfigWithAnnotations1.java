package spring_introduction.classConfigWithAnnotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring_introduction.classPerson.Person;
import spring_introduction.classPet.Cat;

public class ConfigWithAnnotations1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext3.xml");

        Person person = context.getBean("personBean",Person.class);
        person.callYourPet();

        System.out.println(person.getSurname());
        System.out.println(person.getAge());

//        Cat myCat = context.getBean("catBean", Cat.class);
//        myCat.say();

        context.close();
    }
}
