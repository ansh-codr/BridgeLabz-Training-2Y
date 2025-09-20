// Multilevel Inheritance Sample 1: Online Retail Order Management

class Order {
    private String orderId;
    private String orderDate;

    public Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    public String getOrderId() { return orderId; }
    public String getOrderDate() { return orderDate; }

    public String getOrderStatus() {
        return "Order Placed";
    }
}

class ShippedOrder extends Order {
    private String trackingNumber;

    public ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    public String getTrackingNumber() { return trackingNumber; }

    @Override
    public String getOrderStatus() {
        return "Shipped (Tracking: " + trackingNumber + ")";
    }
}

class DeliveredOrder extends ShippedOrder {
    private String deliveryDate;

    public DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    public String getDeliveryDate() { return deliveryDate; }

    @Override
    public String getOrderStatus() {
        return "Delivered on " + deliveryDate;
    }
}

public class OrderMultilevelMain {
    public static void main(String[] args) {
        Order o1 = new Order("O-1001", "2025-09-10");
        Order o2 = new ShippedOrder("O-1002", "2025-09-11", "TRK12345");
        Order o3 = new DeliveredOrder("O-1003", "2025-09-12", "TRK67890", "2025-09-15");

        Order[] orders = { o1, o2, o3 };
        for (Order o : orders) {
            System.out.println(o.getOrderId() + ": " + o.getOrderStatus());
        }
    }
}
