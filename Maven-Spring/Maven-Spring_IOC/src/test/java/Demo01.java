import Entity.BookEntity;
import Entity.UserEntity;
import Factory.UserFactory;
import org.dom4j.DocumentException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo01 {
    /**
     * 工厂模式创建对象
     * @param args
     * @throws ClassNotFoundException
     * @throws InstantiationException
     * @throws IllegalAccessException
     * @throws DocumentException
     */
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, DocumentException {

        UserEntity user = UserFactory.getUser();
        System.out.println(user);
        user.addUser();
    }
}
