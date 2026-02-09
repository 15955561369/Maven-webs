package MemberService;

import org.springframework.stereotype.Component;

/**
 * 被代理类
 */
@Component//此注解能够在.xml文件中进行扫描创建bean对象，相当于<bean id="" class="">
public class MemberServiceImpl implements MemberService {
    /**
     * 被代理方法
     */
    @Override
    public String addMember(){
        String str="无参方法addMember";
        System.out.println(str);
        return str;
    }
    @Override
    public String addMember(String name) {
        //int j=1/0;
        String str="有参方法addMember，参数name="+name;
        System.out.println(str);
        return str;
    }
}
