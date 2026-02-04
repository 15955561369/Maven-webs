import Entity.BookEntity;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo07 {
    /**
     * 普通bean和FactoryBean
     * @param args
     */
    public static void main(String[] args) {
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("bean_02.xml");
        BookEntity bean =(BookEntity) app.getBean("bean");
        System.out.println(bean);
    }
}
