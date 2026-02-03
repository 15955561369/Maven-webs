import Entity.OrderEntity;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 属性注入方法2：有参构造函数
 */
public class Demo03 {
    public static void main(String[] args) {
        //直接读取配置文件完成属性注入
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("Order.xml");
        //2.根据bean的id找到对象
        OrderEntity orderEntity = classPathXmlApplicationContext.getBean("orderEntity", OrderEntity.class);
        System.out.println(orderEntity);
    }
}
