package springIntroduction.annotationsAndXMLFile.realizationLifecycle;

public class Cat implements Pet {
    public Cat() {
        System.out.println("Cat bean is created");
    }

    @Override
    public void say() {
        System.out.println("Meow-Meow");
    }

    public  void init(){
        System.out.println("Class dog : init method");
    }

    public void destroy(){
        System.out.println("Class Dog : destroy method");
    }
}
