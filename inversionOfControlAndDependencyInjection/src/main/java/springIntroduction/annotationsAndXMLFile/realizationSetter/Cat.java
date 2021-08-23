package springIntroduction.annotationsAndXMLFile.realizationSetter;

import org.springframework.stereotype.Component;

@Component("Cat")
public class Cat implements Pet {
    public Cat() {
        System.out.println("Cat bean is created");
    }

    @Override
    public void say() {
        System.out.println("Meow-Meow");
    }
}
