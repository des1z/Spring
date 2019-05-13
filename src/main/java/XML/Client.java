package XML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        System.out.println("Мне нужен врач!");
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Registry registry = context.getBean("registry", Registry.class);
        registry.findCard();
    }
}
