package spring_aop;

import org.springframework.stereotype.Component;

@Component
public class SchoolLibrary extends AbstractLibrary {

//    @Override
//    public void getBook() {
//        System.out.println("Мы берём книгу из SchoolLibrary");
//    }

    public void getBook() {
        System.out.println("Мы берём книгу из SchoolLibrary");
    }
}
