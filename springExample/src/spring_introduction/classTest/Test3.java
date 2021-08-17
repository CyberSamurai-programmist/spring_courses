package spring_introduction.classTest;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring_introduction.classPerson.Person;

/**
 * Способы внедрения зависимостей
 * С помощью конструктора
 * С помощью сеттеров
 * Autowiring
 */

public class Test3 {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

//        Pet pet = context.getBean("myPet", Pet.class);
//        Pet pet = new Dog();
//        Person person = new Person(pet);

        Person person = context.getBean("myPerson", Person.class);
        person.callYourPet();

        System.out.println(person.getSurname());
        System.out.println(person.getAge());

        context.close();
    }
}
