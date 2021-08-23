package spring_aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAndSecurityAspect {

    @Pointcut("execution(* spring_aop.UniLibrary.*(..))")
    private void allMethodsFromUniLibrary(){}

    @Pointcut("execution(public void spring_aop.UniLibrary.returnMagazine())")
    private void returnMagazineFromUniLibrary(){}

    @Pointcut("allMethodsFromUniLibrary() && !returnMagazineFromUniLibrary() ")
    private void allMethodsExceptReturnMagazineFromUniLibrary(){}

    @Before("allMethodsExceptReturnMagazineFromUniLibrary()")
    public void beforeAllMethodsExceptReturnMagazineAdvice(){
        System.out.println("beforeAllMethodsExceptReturnMagazineAdvice : Log #10");
    }

//    @Pointcut("execution(* spring_aop.UniLibrary.get*())")
//    private void allGetMethodFromUniLibrary(){}
//
//    @Pointcut("execution(* spring_aop.UniLibrary.return*())")
//    private void allReturnMethodFromUniLibrary(){}
//
//    @Pointcut("allGetMethodFromUniLibrary() || allReturnMethodFromUniLibrary()")
//    private void allGetAndReturnMethodFromUniLibrary(){}
//
//
//    @Before("allGetMethodFromUniLibrary())")
//    private void beforeGetLoggingAdvice(){
//        System.out.println("beforeGetLoggingAdvice: writing log #1");
//    }
//
//    @Before("allReturnMethodFromUniLibrary())")
//    private void beforeReturnLoggingAdvice(){
//        System.out.println("beforeReturnLoggingAdvice: writing log #2");
//    }
//
//    @Before("allGetAndReturnMethodFromUniLibrary()")
//    public void beforeGetAndReturnLoggingAdvice(){
//        System.out.println("beforeGetAndReturnLoggingAdvice: writing log #3");
//    }

//    @Pointcut("execution(* get*())")
//    private void allGetMethods() {
//    }

//    @Before("execution(public void getBook())")
//    public void beforeGetBookAdvice(){
//        System.out.println("beforeGetBookAdvice : попытка получить книгу");
//    }

//    @Before("execution(public void getBook(String))")
//    public void beforeGetBookAdvice(){
//        System.out.println("beforeGetBookAdvice : попытка получить книгу");
//    }

//    @Before("execution(public void spring_aop.UniLibrary.getBook())")
//    public void beforeGetBookAdvice(){
//        System.out.println("beforeGetBookAdvice : попытка получить книгу");
//    }

//    @Before("execution(public void get*())")
//    public void beforeGetBookAdvice(){
//        System.out.println("beforeGetBookAdvice : попытка получить книгу/журнал");
//    }

//    @Before("execution(public void getBook(..))")
//    public void beforeGetBookAdvice(){
//        System.out.println("beforeGetBookAdvice : попытка получить книгу");
//    }

//    @Before("execution(public void getBook(spring_aop.Book))")
//    public void beforeGetBookAdvice(){
//        System.out.println("beforeGetBookAdvice : попытка получить книгу");
//    }

//    @Before("execution(public void *(*))")
//    public void beforeGetBookAdvice(){
//        System.out.println("beforeGetBookAdvice : попытка получить книгу/журнал");
//    }

//    @Before("execution(public void returnBook())")
//    public void beforeReturnBookAdvice() {
//        System.out.println("beforeReturnBookAdvice : попытка вернуть книгу");
//    }

//    @Before("execution(public * returnBook())")
//    public void beforeReturnBookAdvice(){
//        System.out.println("beforeReturnBookAdvice : попытка вернуть книгу");
//    }

//    @Before("execution(* returnBook())")
//    public void beforeReturnBookAdvice(){
//        System.out.println("beforeReturnBookAdvice : попытка вернуть книгу");
//    }

//    @Before("execution(public * get*())")
//    @Before("allGetMethods()")
//    public void beforeGetBookAdvice() {
//        System.out.println("beforeGetBookAdvice : попытка получить книгу/журнал");
//    }
//
////    @Before("execution(* get*())")
//    @Before("allGetMethods()")
//    public void beforeGetSecurityAdvice() {
//        System.out.println("beforeGetSecurityAdvice : проверка прав на получение книги/журнала");
//    }
}
