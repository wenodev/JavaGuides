package weno.javaBasedConfigExample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
public class AppConfiguration2 {

    @Bean(name="twitterService")
    public MessageService twitterService(){
        return new TwitterService();
    }

    @Bean
    public MessageProcessor messageProcessor(){
        return new MessageProcessorImpl(twitterService());
    }



}
