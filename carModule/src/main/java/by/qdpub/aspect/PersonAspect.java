package by.qdpub.aspect;

import org.apache.log4j.Logger;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PersonAspect {
    private static final Logger log = Logger.getLogger(PersonAspect.class);

/*    @Before("execution(* by.qdpub.service.CarService.*(..))")
    public void doSomethingBefore(){
        log.info("Try to read persons!");
        System.out.println("Try to read persons!");
    }

    @After("execution(* by.qdpub.service.CarService.*(..))")
    public void doSomethingAfter(){
        log.error("Successfully!");
        System.out.println("Successfully!");
    }*/

/*    @Around("execution(* by.qdpub.service.PersonService.*(..))")
    public void doSomethingAround(ProceedingJoinPoint joinPoint){

        log.info("BEGIN READ!");
        System.out.println();
        try {
            joinPoint.proceed();
            log.info("FINISH READ!");
        } catch (Throwable throwable) {
            log.fatal(throwable.toString());
        }
        System.out.println();

    }*/

    public static void main(String[] args) {
        log.fatal("fatal");
        log.error("error");
        log.warn("warning");
        log.debug("debug");
        log.info("info");
        log.trace("trace");

        try {
            int c = 10 / 0;
        } catch (Exception e) {
            log.error(e.toString());
        }

        try {
            String s = null;
            if (s.length() > 10) {
                System.out.println();
            }
        } catch (Exception e) {
            log.error(e.toString());
        }

    }

}
