package ioc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Application {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        context.close();

//        XmlBeanFactory factory = new XmlBeanFactory (new ClassPathResource("applicationContext.xml"));
//        HelloWorld obj = (HelloWorld) factory.getBean("helloWorld");
//        obj.getMessage();


    }

}
