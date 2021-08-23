package springIntroduction.annotationsAndXMLFile.realizationSetter;

import org.springframework.stereotype.Component;

@Component("Dog")
public class Dog implements Pet {

    public Dog() {
        System.out.println("Dog bean is created");
    }

    @Override
    public void say() {
        System.out.println("Bow-Wow");
    }
}
