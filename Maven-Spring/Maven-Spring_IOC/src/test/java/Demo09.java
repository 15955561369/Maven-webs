import Entity.BookEntity;
import Entity.LifeCycle;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo09 {
    /**
     * Spring的生命周期 Bean的后置处理器
     * @流程： 实例化、属性赋值、初始化、正常使用、销毁
     * @param args
     */
    public static void main(String[] args) {
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("LifeCycle.xml");
        LifeCycle lifeCycle = (LifeCycle) app.getBean("lifeCycle");
        System.out.println(lifeCycle);
        app.close();
    }
}
