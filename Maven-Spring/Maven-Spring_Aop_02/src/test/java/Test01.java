import MemberService.MemberService;
import MemberService.MemberServiceImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {
    /**
     * Aop案例
     * @param args
     */
    public static void main(String[] args) {
        // 1.读取.xml配置文件，创建bean对象
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("spring.xml");
        // 2.拿到bean对象 注意：Spring-aop默认使用jdk动态代理，基于接口的方式代理，所以返回的数据类型应该是接口而不是实现类。
        MemberService memberServiceProxy = app.getBean("memberServiceImpl", MemberService.class);
        // 3.执行目标方法
        memberServiceProxy.addMember();
        memberServiceProxy.addMember("ZHANGSAN");
    }
}
