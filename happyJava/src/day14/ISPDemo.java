package day14;
//interface OrderService{
//    void placeOrder(String item);
//    void cancelOrder(String orderId);
//}


interface OrderOperations {
    void placeOrder(String item);
}

interface CancelOperations {
    void cancelOrder(String orderId);
}


class OrderClien{
    private final OrderOperations orderService;

    public OrderClien(OrderOperations orderService){
        this.orderService = orderService;
    }

    public void createNewOrder(){
        orderService.placeOrder("book");
    }
}

class OnlineOrderService implements CancelOperations, OrderOperations{
    @Override
    public void cancelOrder(String orderId) {

    }

    @Override
    public void placeOrder(String item) {

    }
}


public class ISPDemo {
    public static void main(String[] args) {
        OnlineOrderService service = new OnlineOrderService();
        OrderClien client = new OrderClien(service);
        client.createNewOrder();

        service.cancelOrder("ORD1234");
    }


}
