import Entity.UserEntity;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {
    public static void main(String[] args) {
        //传统通过new的形式创建对象
        new UserEntity().addUser();

        //使用Spring beans容器
        //1.读取Spring的配置文件xml
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring.xml");
        //2.根据bean的id找到对象
        UserEntity userEntity = classPathXmlApplicationContext.getBean("userEntity", UserEntity.class);
        System.out.println(userEntity);
        userEntity.addUser();
    }
}
