import Entity.LifeCycle;
import Entity.MemberEntity;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo10 {
    /**
     * Bean的自动装配
     * @param args
     */
    public static void main(String[] args) {
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("AutoWire.xml");
        MemberEntity memberEntity = (MemberEntity) app.getBean("memberEntity");
        System.out.println(memberEntity);
        app.close();
    }
}
