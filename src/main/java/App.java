import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld beanTwo =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println("Равны ли 2 бина HelloWorld? Ответ: " + (bean==beanTwo));
        Cat beanCatOne = (Cat) applicationContext.getBean("cat");
        Cat beanCatTwo = (Cat) applicationContext.getBean("cat");
        System.out.println("Равны ли 2 бина Cat? Ответ: " + (beanCatOne==beanCatTwo));
    }
}