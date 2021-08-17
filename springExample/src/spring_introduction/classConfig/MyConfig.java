package spring_introduction.classConfig;

import org.springframework.context.annotation.*;
import spring_introduction.classPerson.Person;
import spring_introduction.classPet.Cat;
import spring_introduction.interfacePet.Pet;

@Configuration
//@ComponentScan("spring_introduction")
@PropertySource("classpath:myApp.properties")
public class MyConfig {

    @Bean
    @Scope("singleton")
    public Pet catBean(){
        System.out.println("!!!");
        return new Cat();
    }

    @Bean
    public Person personBean(){
        return new Person(catBean());
    }
}
