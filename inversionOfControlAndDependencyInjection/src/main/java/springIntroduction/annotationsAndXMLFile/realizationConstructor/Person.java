package springIntroduction.annotationsAndXMLFile.realizationConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person {
    private Pet pet;
    @Value("Matvey")
    private String name;
    @Value("23")
    private int age;

    public Person() {
        System.out.println("Person bean is created");
    }

    public Person(Pet pet) {
        this.pet = pet;
    }

    @Autowired
    public void setPet(@Qualifier("dogBean") Pet pet) {
        System.out.println("Class Person: set Pet");
        this.pet = pet;
    }

    public void setName(String name) {
        System.out.println("Class Person: set name");
        this.name = name;
    }

    public void setAge(int age) {
        System.out.println("Class Person: set age");
        this.age = age;
    }

    public Pet getPet() {
        return pet;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void callYourPet() {
        System.out.println("Hello, my lovely Pet!");
        pet.say();
    }
}
