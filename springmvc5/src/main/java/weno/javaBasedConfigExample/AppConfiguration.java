package weno.javaBasedConfigExample;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("weno.javaBasedConfigExample")
@Import(AppConfiguration2.class)
public class AppConfiguration {

    @Bean(name="emailService")
    public MessageService emailService(){
        return new EmailService();
    }

    @Bean(name="smsService")
    public MessageService smsService(){
        return new SMSService();
    }

}
