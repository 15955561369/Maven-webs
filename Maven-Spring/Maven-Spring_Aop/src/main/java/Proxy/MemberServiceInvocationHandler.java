package Proxy;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

@Slf4j
public class MemberServiceInvocationHandler implements InvocationHandler {

    private Object target;//被调用方法所在的接口
    public MemberServiceInvocationHandler(Object target) {
        this.target = target;
    }

    /**
     * jdk动态代理
     * @param proxy 代理类（自动生成）
     * @param method 需要调用的方法
     * @param args 方法中的参数
     * @return 方法执行结果
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable{
        log.info(">>【jdk动态代理】增强在方法之前的功能<<");
        /**
         * 执行待调用的方法，target为方法所在的接口，args为方法中的参数
         * 返回方法的执行结果
         */
        Object result=method.invoke(target,args);//反射机制

        log.info(">>【jdk动态代理】增强在方法之后的功能<<");
        return result;
    }

    /**
     * 生成一个代理类对象，调用上面invoke方法时传进去
     * @return 目标类的代理类
     * @param <T>
     */
    public <T> T getProxy(){
        // <T>表示该方法中用到了一个类型参数 T，该方法的返回类型为T，(T)能够实现强转。

        /**
         * 参数一：目标接口的类加载器
         * 参数二：目标接口的实现类实现的所有接口
         * 参数三：InvocationHandler，即本类
         */
        return (T) Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }
}
