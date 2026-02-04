import Service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo04 {
    /**
     * 外部属性输入bean
     * @param args
     */
    public static void main(String[] args) {
        //ApplicationContext直接读取配置文件
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("bean.xml");
        UserService userService = (UserService) app.getBean("userService");
        userService.addUser();
    }
}
