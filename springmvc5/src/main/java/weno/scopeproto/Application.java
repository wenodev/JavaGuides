package weno.scopeproto;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        MessageService messageService = context.getBean(MessageService.class);
        messageService.setMessage("TwitterMessageService Implementation");
        messageService.setMessage("dd");
        System.out.println(messageService.getMessage());

        MessageService messageService1 = context.getBean(MessageService.class);
        System.out.println(messageService1.getMessage());
        context.close();


    }
}
