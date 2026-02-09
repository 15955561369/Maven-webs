package Proxy;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * 代理类
 */
@Slf4j
@Aspect
@Component//也需要创建代理类的bean对象
public class Proxy {

    /**
     * 方法addMember(String name)的前置通知
     * value = 切入点表达式
     */
    @Before(value = "execution(public String MemberService.MemberServiceImpl.addMember(String));")
    public void before() {
        log.info("前置通知");
    }

    /**
     * 方法addMember()和addMember(String name)的后置通知
     */
    @After(value = "execution(public String MemberService.MemberServiceImpl.addMember(..));")
    public void after() {
        log.info("后置通知");
    }

    /**
     * 方法addMember()和addMember(String name)的环绕通知
     */
    @Around(value = "execution(public String MemberService.MemberServiceImpl.addMember(..));")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        log.info(">>环绕通知：执行方法之前<<");
        Object result = joinPoint.proceed();//执行目标方法
        log.info(">>环绕通知：执行方法之后<<");
        return result;
    }

    /**
     * 方法addMember()和addMember(String name)的异常通知
     */
    @AfterThrowing(value = "execution(public String MemberService.MemberServiceImpl.addMember(..));")
    public void afterThrowing() {
        log.info(">>异常通知<<");
    }
}
