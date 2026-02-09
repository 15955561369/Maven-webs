package Proxy;

import OrderService.OrderService;
import lombok.extern.slf4j.Slf4j;

/**
 * 静态代理模式
 * @OrderServiceImpl的代理类Proxy实现功能扩展
 */
@Slf4j
public class OrderServiceImplProxy {
  private OrderService orderService;

  public OrderServiceImplProxy(OrderService orderService) {
    this.orderService = orderService;
  }

  public void addOrder(String orderName) {
    //增强的功能：打印日志
    log.info("【增强在addOrder()之前的功能】");

    orderService.addOrder(orderName);

    log.info("【增强在addOrder()之后的功能】");
  }
}
