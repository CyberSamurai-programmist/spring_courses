package spring_aop;

import jdk.jshell.MethodSnippet;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class LoggingAspect {

    //    @Before("execution(public * get*())")
    @Before("spring_aop.MyPointcuts.allAddMethods()")
    public void beforeAddLoggingAdvice(JoinPoint joinPoint) {

        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("MethodSignature = "
                + methodSignature);
        System.out.println("MethodSignature.getMethod() = "
                + methodSignature.getMethod());
        System.out.println("MethodSignature.getReturnType() = "
                + methodSignature.getReturnType());
        System.out.println("MethodSignature.getName() = "
                + methodSignature.getName());

        if (methodSignature.getName().equals("addBook")) {
            Object[] arg = joinPoint.getArgs();
            for (Object obj : arg) {
                if (obj instanceof Book) {
                    Book myBook = (Book) obj;
                    System.out.println("Информация о книге: название - " +
                            myBook.getName() + ", автор - " + myBook.getAuthor() +
                            ", год издания - " + myBook.getYearOfPublication());
                }
                else if (obj instanceof String){
                    System.out.println("книгу в библиотеку добавляет " + obj);
                }
            }
        }


        System.out.println("beforeGetBookAdvice : логирование " +
                "попытки получить книгу/журнал");
        System.out.println("--------------------------------------------");
    }

//    @Pointcut("execution(* spring_aop.UniLibrary.*(..))")
//    private void allMethodsFromUniLibrary(){}
//
//    @Pointcut("execution(public void spring_aop.UniLibrary.returnMagazine())")
//    private void returnMagazineFromUniLibrary(){}
//
//    @Pointcut("allMethodsFromUniLibrary() && !returnMagazineFromUniLibrary() ")
//    private void allMethodsExceptReturnMagazineFromUniLibrary(){}
//
//    @Before("allMethodsExceptReturnMagazineFromUniLibrary()")
//    public void beforeAllMethodsExceptReturnMagazineAdvice(){
//        System.out.println("beforeAllMethodsExceptReturnMagazineAdvice : Log #10");
//    }

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
}
