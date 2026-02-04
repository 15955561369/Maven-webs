import Collections.Collections;
import Entity.MemberEntity;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo06 {
    /**
     * 注入集合类型的属性
     * @param args
     */
    public static void main(String[] args) {
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("Collections.xml");
        Collections collections =(Collections) app.getBean("collections");
        System.out.println(collections);
    }
}
