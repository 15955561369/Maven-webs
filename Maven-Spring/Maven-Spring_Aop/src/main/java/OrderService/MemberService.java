package OrderService;

/**
 * jdk动态代理/cglib动态代理
 * 被代理接口（目标接口）
 */
public interface MemberService {
    /**
     * 被代理方法
     * @param uname
     */
    void addMember(String uname);
}
