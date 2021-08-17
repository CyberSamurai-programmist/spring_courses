package spring_introduction.classPerson;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import spring_introduction.interfacePet.Pet;

@Component("personBean")
public class Person {
//    @Autowired
//    @Qualifier("dog")
    private Pet pet;

//    @Value("Loban")
    @Value("${person.surname}")
    private String surname;

//    @Value("23")
    @Value("${person.age}")
    private int age;

    @Autowired
    public Person(@Qualifier("dog") Pet pet) {
        System.out.println("Person bean is created");
        this.pet = pet;
    }

    public Person() {
        System.out.println("Person bean is created");
    }

    // pet -> setPet (pet -> Pet)(Pet -> setPet)

//    @Autowired
//    @Qualifier("dog")
    public void setPet(Pet pet) {
        System.out.println("Class Person: set Pet");
        this.pet = pet;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        System.out.println("Class Person: set surname");
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Class Person: set age");
        this.age = age;
    }

    public void callYourPet() {
        System.out.println("Helloy, my lovely Pet!");
        pet.say();
    }
}
