package cs665.HW2;

public class DeliveryAppMain {
    public static void main(String[] args) {
        // Create a Shop instance
        Shop shop = new ShopImpl();

        // Create DeliveryDriver instances
        DeliveryDriver driver1 = new DeliveryDriverImpl("Scooter");
        DeliveryDriver driver2 = new DeliveryDriverImpl("Bike");
        DeliveryDriver driver3 = new DeliveryDriverImpl("Car");
        DeliveryDriver driver4 = new DeliveryDriverImpl("Bus");
        DeliveryDriver driver5 = new DeliveryDriverImpl("Walker");

        // Add drivers as observers to the shop
        shop.addObserver(driver1);
        shop.addObserver(driver2);
        shop.addObserver(driver3);
        shop.addObserver(driver4);
        shop.addObserver(driver5);

        // Create a delivery request and notify all drivers
        DeliveryRequest deliveryRequest = new DeliveryRequest(1, "Addy");
        deliveryRequest.sendNotification(shop);
    }
}