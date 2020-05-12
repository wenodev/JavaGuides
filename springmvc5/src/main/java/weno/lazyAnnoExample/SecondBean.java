package weno.lazyAnnoExample;

import org.springframework.stereotype.Component;

@Component
public class SecondBean {

    public SecondBean(){
        System.out.println("Inside SecondBean Constructor");
    }

    public void test(){
        System.out.println("Method of SecondBean Class");
    }


}
