package com.kodilla.mockito.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

class WeatherNotificationServiceTest {

    private WeatherNotificationService notificationService;
    private Client client1;
    private Client client2;

    @BeforeEach
    public void setUp() {
        notificationService = new WeatherNotificationService();
        client1 = mock(Client.class);
        client2 = mock(Client.class);
    }

    @Test
    public void shouldAddSubscriberToLocation() {
        notificationService.addSubscriber("WARSZAWA", client1);
        notificationService.sendNotificationToLocation("WARSZAWA", "BURZA");

        Mockito.verify(client1, times(1)).receive("BURZA");
    }

    @Test
    public void shouldNotAddSameSubscriberTwiceToLocation() {
        notificationService.addSubscriber("WARSZAWA", client1);
        notificationService.addSubscriber("WARSZAWA", client1);

        notificationService.sendNotificationToLocation("WARSZAWA", "DESZCZ");

        Mockito.verify(client1, times(1)).receive("DESZCZ");
    }

    @Test
    public void shouldRemoveSubscriberFromLocation() {
        notificationService.addSubscriber("KRAKOW", client1);
        notificationService.removeSubscriber("KRAKOW", client1);

        notificationService.sendNotificationToLocation("KRAKOW", "SNIEG");

        Mockito.verify(client1, never()).receive("SNIEG");
    }

    @Test
    public void shouldRemoveAllSubscriptionsForClient() {
        notificationService.addSubscriber("WARSZAWA", client1);
        notificationService.addSubscriber("KRAKOW", client1);

        notificationService.removeAllSubscriptions(client1);
        notificationService.sendNotificationToLocation("WARSZAWA", "CIEPELKO");
        notificationService.sendNotificationToLocation("KRAKOW", "CIEPELKO");

        Mockito.verify(client1, never()).receive(anyString());
    }

    @Test
    public void shouldSendNotificationToAllSubscribersOfLocation() {
        notificationService.addSubscriber("GDANSK", client1);
        notificationService.addSubscriber("GDANSK", client2);

        notificationService.sendNotificationToLocation("GDANSK", "WIATER");

        Mockito.verify(client1, times(1)).receive("WIATER");
        Mockito.verify(client2, times(1)).receive("WIATER");
    }

    @Test
    public void shouldSendNotificationToAllClients() {
        notificationService.addSubscriber("WARSZAWA", client1);
        notificationService.addSubscriber("KRAKOW", client2);

        notificationService.sendNotificationToAll("ALERT RCB");

        Mockito.verify(client1, times(1)).receive("ALERT RCB");
        Mockito.verify(client2, times(1)).receive("ALERT RCB");
    }

    @Test
    public void shouldDeleteLocationAndNoLongerSendNotifications() {
        notificationService.addSubscriber("NASIELSK", client1);
        notificationService.deleteLocation("NASIELSK");

        notificationService.sendNotificationToLocation("NASIELSK", "DESZCZ");

        verify(client1, never()).receive("DESZCZ");
    }
}