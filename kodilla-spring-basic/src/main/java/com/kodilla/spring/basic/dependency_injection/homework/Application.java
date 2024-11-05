package com.kodilla.spring.basic.dependency_injection.homework;

public class Application {

    public static void main(String[] args) {
        DeliveryServiceInterface deliveryService = new DeliveryService();
        NotificationServiceInterface notificationService = new NotificationService();
        ShippingCenter shippingCenter = new ShippingCenter(deliveryService, notificationService);

        shippingCenter.sendPackage("Sokratesa, Warsaw", 99.9);
    }
}