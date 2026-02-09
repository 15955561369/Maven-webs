import OrderService.MemberServiceImpl;
import Proxy.MemberServiceInterceptor;
import net.sf.cglib.core.DebuggingClassWriter;
import net.sf.cglib.proxy.Enhancer;

public class Test03 {
    /**
     * cglib动态代理
     * @param args
     */
    public static void main(String[] args) {
        // 1.设置MethodInterceptor
        MemberServiceInterceptor memberServiceInterceptor = new MemberServiceInterceptor();
        Enhancer enhancer = new Enhancer();
        // 2.设置代理类（需要继承被代理类）
        enhancer.setSuperclass(MemberServiceImpl.class);
        // 3.设置回调
        enhancer.setCallback(memberServiceInterceptor);
        // 4.创建代理类（因为继承了被代理类，所以用被代理类接收）
        MemberServiceImpl o = (MemberServiceImpl) enhancer.create();
        // 5.执行方法
        o.addMember("ZZY");
    }
}
