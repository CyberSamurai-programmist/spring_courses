package spring_aop;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointcuts {

    @Pointcut("execution(* abc*(..))") // add
    public void allAddMethods() {
    }
}
