import OrderService.MemberService;
import OrderService.MemberServiceImpl;
import Proxy.MemberServiceInvocationHandler;

public class Test02 {
    /**
     * JDK动态代理
     * @param args
     */
    public static void main(String[] args) {
        // 1.设置InvocationHandler
        MemberServiceInvocationHandler jdkInvocationHandler = new MemberServiceInvocationHandler(new MemberServiceImpl());
        //2.拿到代理类，实现MemberService接口
        MemberService memberServiceProxy = jdkInvocationHandler.getProxy();
        //3.利用代理类执行目标方法，会自动执行到invocationHandler中的invoke方法，同时传进代理类、addMember的方法对象、参数。
        memberServiceProxy.addMember("Yz");
    }
}
