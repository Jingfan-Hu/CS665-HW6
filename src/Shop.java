package cs665.HW2;

public interface Shop {
    void addObserver(DeliveryDriver observer);
    void removeObserver(DeliveryDriver observer);
    void notifyObservers(DeliveryRequest deliveryRequest);
}
