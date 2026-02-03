import Entity.BookEntity;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 属性注入方法1：setter方法
 */

public class Demo02 {
    public static void main(String[] args) {
        //直接读取配置文件完成属性注入
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("Book.xml");
        //2.根据bean的id找到对象
        BookEntity bookEntity = classPathXmlApplicationContext.getBean("bookEntity", BookEntity.class);
        System.out.println(bookEntity);
    }
}
