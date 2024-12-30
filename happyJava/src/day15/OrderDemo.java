package day15;
 class Order {
    private String productName;
    private int quantity;

    public Order(String productName, int quantity) {
        this.productName = productName;
        this.quantity = quantity;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }
}

// OrderService.java (POJO)
 class OrderService {
    public boolean validateOrder(Order order) {
        // 단순 검증 로직 (재고 등의 실질 검증은 생략)
        if (order.getProductName() == null || order.getProductName().isEmpty()) {
            return false;
        }
        return order.getQuantity() > 0;
    }
}

public class OrderDemo {
    public static void main(String[] args) {
//        Order order = new Order("Laptop", 1);
//        OrderService service = new OrderService();
//        boolean result = service.validateOrder(order);
//        System.out.println(result);


        Order order = new Order("", 1);
        OrderService service = new OrderService();
        boolean result = service.validateOrder(order);
        System.out.println(result);
    }
}
