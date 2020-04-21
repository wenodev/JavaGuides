package weno.lazyAnnoExample;

import org.springframework.stereotype.Component;

@Component
public class FirstBean {

    public FirstBean(){
        System.out.println("Inside FirstBean Constructor");
    }

    public void test(){
        System.out.println("Method of FirstBean Class");
    }

}
