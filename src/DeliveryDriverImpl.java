package cs665.HW2;

public class DeliveryDriverImpl implements DeliveryDriver {
    private String name;

    public DeliveryDriverImpl(String name) {
        this.name = name;
    }

    //To provide more information when a driver receives a delivery request
    @Override
    public void update(DeliveryRequest deliveryRequest) {
        System.out.println("Driver " + name + " received a delivery request (Order ID: " + 
                           deliveryRequest.getOrderId() + "): " + deliveryRequest);
    }
}