package com.kodilla.spring.basic.spring_dependency_injection.homework;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class ShippingCenterTestSuite {

    @Autowired
    private ShippingCenter shippingCenter;
    private DeliveryService deliveryService;
    private NotificationService notificationService;

    @BeforeEach
    void setUp() {
        this.deliveryService = Mockito.mock(DeliveryService.class);
        this.notificationService = Mockito.mock(NotificationService.class);
        this.shippingCenter = new ShippingCenter(deliveryService, notificationService);
    }

    @Test
    public void testSendPackageDelivered() {
        String address = "Sokratesa 123";
        double weight = 10.0;
        Mockito.when(deliveryService.deliverPackage(address, weight)).thenReturn(true);
        Mockito.when(notificationService.success(address)).thenReturn("Package delivered to: " + address);
        String result = shippingCenter.sendPackage(address, weight);
        assertEquals("Package delivered to: Sokratesa 123", result);
        Mockito.verify(deliveryService).deliverPackage(address, weight);
        Mockito.verify(notificationService).success(address);
    }

    @Test
    public void testSendPackageNotDelivered() {
        String address = "Sokratesa 123";
        double weight = 123.0;
        Mockito.when(deliveryService.deliverPackage(address, weight)).thenReturn(false);
        Mockito.when(notificationService.fail(address)).thenReturn("Package not delivered to: " + address);

        String result = shippingCenter.sendPackage(address, weight);
        assertEquals("Package not delivered to: Sokratesa 123", result);
        Mockito.verify(deliveryService).deliverPackage(address, weight);
        Mockito.verify(notificationService).fail(address);
    }
}