package weno.javaBasedConfigExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import weno.scopeproto.Application;

public class TestApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfiguration.class);
        MessageProcessor userService = applicationContext.getBean(MessageProcessor.class);
        userService.processMsg("twitter message sending");
    }


}
