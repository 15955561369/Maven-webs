package Entity;

public class OrderEntity {
    private String orderId;
    private String orderDate;

    public OrderEntity() {

    }

    public OrderEntity(String orderId, String orderDate) {
        System.out.println("有参构造方法属性注入");
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    @Override
    public String toString() {
        return "OrderEntity{" +
                "orderId='" + orderId + '\'' +
                ", orderDate='" + orderDate + '\'' +
                '}';
    }
}
