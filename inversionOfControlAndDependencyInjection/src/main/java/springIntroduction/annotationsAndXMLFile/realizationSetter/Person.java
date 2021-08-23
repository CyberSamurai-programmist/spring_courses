package springIntroduction.annotationsAndXMLFile.realizationSetter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("Person")
public class Person {
    private Pet pet;
    private String name;
    private int age;

    public Person() {
        System.out.println("Person bean is created");
    }

    public Person(Pet pet) {
        this.pet = pet;
    }

    @Autowired
    @Qualifier("Dog")
    public void setPet(Pet pet) {
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
