package model;

import java.time.LocalDate;

public class RestaurantThing {
    private final String restaurantName;
    private final String dishName;
    private final Float dishPrice;
    private final LocalDate dateTime;

    public RestaurantThing(String restaurantName, String dishName, Float dishPrice, LocalDate dateTime) {
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

    public LocalDate getDate() {
        return dateTime;
    }
}
