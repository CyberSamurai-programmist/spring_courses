package spring_introduction.classPet;

import org.springframework.stereotype.Component;
import spring_introduction.interfacePet.Pet;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
//@Scope("prototype")
public class Dog implements Pet {
//    private String name;


    public Dog() {
        System.out.println("Dog bean is created");
    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

    @Override
    public void say() {
        System.out.println("Bow-Wow");
    }


/**  У данных методов access modifier может быть любым
    У данных методов return type может быть любым. Но
    из-за того, что возвращаемое значение мы никак не
    можем использовать, чаще всего return type - это void
    Называться данные методы могут как угодно
    Парамметров быть не должно
*/

//    @PostConstruct
//    public  void init(){
//        System.out.println("Class dog : init method");
//    }
//
//    @PreDestroy
//    public void destroy(){
//        System.out.println("Class Dog : destroy method");
//    }
}
