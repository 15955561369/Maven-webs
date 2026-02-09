package Proxy;


import lombok.extern.slf4j.Slf4j;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

@Slf4j
public class MemberServiceInterceptor implements MethodInterceptor {
    /**
     * cglib动态代理，实现MethodInterceptor接口。重写intercept方法，执行被代理方法时会回调到此方法。
     * @param o cglib生成的代理类
     * @param method 被代理方法（底层通过反射获取）
     * @param objects 传递方法参数
     * @param methodProxy
     * @return 方法执行结果
     * @throws Throwable
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        log.info(">>【cglib动态代理：功能增强】执行在被代理方法之前<<");

        Object result = methodProxy.invokeSuper(o, objects);//传递参数执行被代理方法，返回执行结果

        log.info(">>【cglib动态代理：功能增强】执行在被代理方法之后<<");

        return result;
    }
}
