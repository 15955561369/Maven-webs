package Factory;

import Dom4j.Dom4j;
import Entity.BookEntity;
import Entity.UserEntity;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;

import static java.lang.Class.forName;

/**
 * 工厂模式
 */
public class UserFactory {
    /**
     * 创建UserEntity对象
     * @return
     * @throws ClassNotFoundException
     * @throws InstantiationException
     * @throws IllegalAccessException
     */
    public static UserEntity getUser() throws ClassNotFoundException, InstantiationException, IllegalAccessException, DocumentException {
        //通过dom4j获取到class路径
        Dom4j dom4j = new Dom4j();
        String classPath= dom4j.getClassPath();
        //通过反射机制动态创建对象
        Class<?> aClass =  Class.forName(classPath);
        UserEntity userEntity = (UserEntity) aClass.newInstance();//默认执行无参构造方法
        return userEntity;
    }
}
