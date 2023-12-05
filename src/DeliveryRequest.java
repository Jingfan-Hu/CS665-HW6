package cs665.HW2;

public class DeliveryRequest {
    private int orderId;
    private String destination;

    public DeliveryRequest(int orderId, String destination) {
    	//Add validation for the input parameters in the constructor
        if (orderId <= 0) {
            throw new IllegalArgumentException("orderId must be a positive integer");
        }
        if (destination == null || destination.trim().isEmpty()) {
            throw new IllegalArgumentException("Destination cannot be null or empty");
        }

        this.orderId = orderId;
        this.destination = destination;
    }
    
    //The DeliveryRequest class exposes its internal state (orderId and destination) through public fields
    //Encapsulate the fields by providing getters for them.
    public int getOrderId() {
        return orderId;
    }

    public String getDestination() {
        return destination;
    }

    public void sendNotification(Shop shop) {
        shop.notifyObservers(this);
    }

    @Override
    public String toString() {
        return "DeliveryRequest{" +
                "orderId=" + orderId +
                ", destination='" + destination + '\'' +
                '}';
    }
}

