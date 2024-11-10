package com.kodilla.mockito.homework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WeatherNotificationService {

    private Map<String, Set<Client>> locationSubscriptions = new HashMap<>();

    public void addSubscriber(String location, Client client) {
        locationSubscriptions.computeIfAbsent(location, k -> new HashSet<>()).add(client);
    }

    public void removeSubscriber(String location, Client client) {
        Set<Client> clients = locationSubscriptions.get(location);
        if (clients != null) {
            clients.remove(client);
            if (clients.isEmpty()) {
                locationSubscriptions.remove(location);
            }
        }
    }

    public void removeAllSubscriptions(Client client) {
        for (Set<Client> clients : locationSubscriptions.values()) {
            clients.remove(client);
        }
        locationSubscriptions.values().removeIf(Set::isEmpty);
    }

    public void sendNotificationToLocation(String location, String notification) {
        Set<Client> clients = locationSubscriptions.get(location);
        if (clients != null) {
            clients.forEach(client -> client.receive(notification));
        }
    }

    public void sendNotificationToAll(String notification) {
        locationSubscriptions.values()
                .stream()
                .flatMap(Set::stream)
                .distinct()
                .forEach(client -> client.receive(notification));
    }

    public void deleteLocation(String location) {
        locationSubscriptions.remove(location);
    }
}
