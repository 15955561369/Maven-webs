package OrderService;

import lombok.extern.slf4j.Slf4j;

/**
 * 静态被代理类（目标类）：实现接口
 */
@Slf4j
public class OrderServiceImpl implements OrderService {

  @Override
  public void addOrder(String orderName) {
    log.info(">>被代理类OrderService的addOrder方法<<:"+orderName);
  }
}
