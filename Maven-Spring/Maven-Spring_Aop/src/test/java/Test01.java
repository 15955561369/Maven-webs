import OrderService.OrderServiceImpl;
import Proxy.OrderServiceImplProxy;

public class Test01 {
  public static void main(String[] args) {
    OrderServiceImplProxy orderServiceImplProxy = new OrderServiceImplProxy(new OrderServiceImpl());
    orderServiceImplProxy.addOrder("yz");
  }
}
