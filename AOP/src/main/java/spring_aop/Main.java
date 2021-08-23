package spring_aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);


        UniLibrary uniLibrary = context.getBean("uniLibrary", UniLibrary.class);
        //        Book book = context.getBean("book", Book.class);
        uniLibrary.getBook();
        uniLibrary.returnMagazine();
        uniLibrary.addBook();
        uniLibrary.returnBook();

//        uniLibrary.getBook("Преступление и наказание");
//        uniLibrary.getMagazine(18);

//        SchoolLibrary schoolLibrary = context.getBean("schoolLibrary", SchoolLibrary.class);
//        schoolLibrary.getBook();

        context.close();
    }
}
