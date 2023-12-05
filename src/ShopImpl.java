package cs665.HW2;

import java.util.ArrayList;
import java.util.List;

public class ShopImpl implements Shop {
    private List<DeliveryDriver> observers = new ArrayList<>();

    @Override
    public void addObserver(DeliveryDriver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(DeliveryDriver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(DeliveryRequest deliveryRequest) {
        for (DeliveryDriver observer : observers) {
            observer.update(deliveryRequest);
        }
    }
}

