package spring_introduction.classTest;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring_introduction.classConfig.MyConfig;
import spring_introduction.classPerson.Person;
import spring_introduction.interfacePet.Pet;

public class Test6 {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

//        Pet cat1 = context.getBean("catBean", Pet.class);
//        Pet cat2 = context.getBean("catBean", Pet.class);
//        cat.say();

        Person person = context.getBean("personBean", Person.class);
        person.callYourPet();

        System.out.println(person.getSurname());
        System.out.println(person.getAge());

        context.close();
    }
}
