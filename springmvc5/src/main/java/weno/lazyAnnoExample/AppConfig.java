package weno.lazyAnnoExample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class AppConfig {

    @Lazy(value = true)
    @Bean
    public FirstBean firstBean(){
        return new FirstBean();
    }

    @Bean
    public SecondBean secondBean(){
        return new SecondBean();
    }


}
