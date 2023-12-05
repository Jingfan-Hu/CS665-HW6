# CS665-HW6
# Delivery App

This is a simple delivery app that facilitates communication between a shop and delivery drivers using the Observer design pattern.

## Changes Made

### 1. Error Handling in `DeliveryRequest`

In the `DeliveryRequest` class, input parameters in the constructor are now validated for correctness. It ensures that `orderId` is a positive integer and `destination` is not null or empty.

```java
public class DeliveryRequest {
    // ... existing code ...

    public DeliveryRequest(int orderId, String destination) {
        if (orderId <= 0) {
            throw new IllegalArgumentException("orderId must be a positive integer");
        }
        if (destination == null || destination.trim().isEmpty()) {
            throw new IllegalArgumentException("Destination cannot be null or empty");
        }

        this.orderId = orderId;
        this.destination = destination;
    }

    // ... existing code ...
}

# Delivery App

A simple delivery app using the Observer design pattern to facilitate communication between a shop and delivery drivers.

## Changes Made

### 2. Improved Information in `DeliveryDriverImpl`

In the `DeliveryDriverImpl` class, additional information, including the order ID, is now included when a driver receives a delivery request.

```java
public class DeliveryDriverImpl implements DeliveryDriver {
    // ... existing code ...

    @Override
    public void update(DeliveryRequest deliveryRequest) {
        System.out.println("Driver " + name + " received a delivery request (Order ID: " + 
                           deliveryRequest.getOrderId() + "): " + deliveryRequest);
    }

    // ... existing code ...
}
# Delivery App

A simple delivery app using the Observer design pattern to facilitate communication between a shop and delivery drivers.

## Changes Made

### 3. Thread Safety in `ShopImpl`

In the `ShopImpl` class, synchronization is added to the `addObserver` and `removeObserver` methods to ensure thread safety.

```java
public class ShopImpl implements Shop {
    private List<DeliveryDriver> observers = new ArrayList<>();

    @Override
    public synchronized void addObserver(DeliveryDriver observer) {
        observers.add(observer);
    }

    @Override
    public synchronized void removeObserver(DeliveryDriver observer) {
        observers.remove(observer);
    }

    // ... existing code ...
}


