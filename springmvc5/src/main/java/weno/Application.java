package weno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import weno.di.AppConfiguration;
import weno.di.ConstructorBasedInjection;

public class Application {
    public static void main(String[] args) {
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//
//        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
//        obj.getMessage();
//
//        context.close();


        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfiguration.class);
        ConstructorBasedInjection fieldBasedInjection = applicationContext.getBean(ConstructorBasedInjection.class);
        fieldBasedInjection.processMsg("twitter message sending");

    }
}
