package OrderService;

import lombok.extern.slf4j.Slf4j;

/**
 * jdk动态代理/cglib动态代理
 * 被代理类（目标类）
 */
@Slf4j
public class MemberServiceImpl implements MemberService {

    /**
     * 被代理方法
     * @param uname
     */
    @Override
    public void addMember(String uname) {
        log.info(">>执行目标方法addMember<< 传递参数："+uname);
    }
}
