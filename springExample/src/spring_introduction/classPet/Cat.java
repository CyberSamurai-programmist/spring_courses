package spring_introduction.classPet;

import org.springframework.stereotype.Component;
import spring_introduction.interfacePet.Pet;

@Component("catBean")
public class Cat implements Pet {
    public Cat() {
        System.out.println("Cat bean is created");
    }

    @Override
    public void say() {
        System.out.println("Meow-Meow");
    }
}
