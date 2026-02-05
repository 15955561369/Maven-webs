import Entity.BookEntity;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo08 {
    /**
     * bean的作用域：
     * 单例 和 多例
     *
     * @param args
     */
    public static void main(String[] args) {
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("Book.xml");
        BookEntity book1 = (BookEntity) app.getBean("bookEntity");
        BookEntity book2 = (BookEntity) app.getBean("bookEntity");
        //单例下，getBean得到同一个对象
        System.out.println(book1);
        System.out.println(book2);
    }
}
