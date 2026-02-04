import Entity.MemberEntity;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo05 {
    /**
     * 内部/级联注入对象bean
     * @param args
     */
    public static void main(String[] args) {

        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("Member.xml");
        MemberEntity memberEntity =(MemberEntity) app.getBean("memberEntity");
        System.out.println(memberEntity);
    }
}
