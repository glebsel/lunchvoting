package model;

import java.time.LocalDateTime;

public class RestaurantThing {
    private final String restaurantName;
    private final String dishName;
    private final Float dishPrice;
    private final LocalDateTime dateTime;

    public RestaurantThing(String restaurantName, String dishName, Float dishPrice, LocalDateTime dateTime) {
        this.restaurantName = restaurantName;
        this.dishName = dishName;
        this.dishPrice = dishPrice;
        this.dateTime = dateTime;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public String getDishName() {
        return dishName;
    }

    public Float getDishPrice() {
        return dishPrice;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }
}
