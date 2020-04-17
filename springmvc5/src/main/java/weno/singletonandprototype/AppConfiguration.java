package weno.singletonandprototype;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfiguration {

    @Bean
    @Scope("prototype")
    public UserService userService(){
        return new UserService();
    }

}
