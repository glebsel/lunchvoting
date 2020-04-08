package model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class RestaurantThing {
    private final Integer id;
    private final String restaurantName;
    private final String dishName;
    private final Float dishPrice;
    private final LocalDate dateTime;
    private boolean wasVoted = false;
    private static Integer count = 0;

//    public RestaurantThing(String restaurantName, String dishName, Float dishPrice, LocalDate dateTime) {
//        this(null, restaurantName, dishName, dishPrice, dateTime);
//    }

    public RestaurantThing(String restaurantName, String dishName, Float dishPrice, LocalDate dateTime) {
        count++;
        this.id = count;
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

    @Override
    public String toString() {
        return "MealTo{" +
                "id=" + id +
                ", restaurantName=" + restaurantName +
                ", dishName='" + dishName + '\'' +
                ", dishName='" + dishName + '\'' +
                ", dishPrice=" + dishPrice +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public boolean getWasVoted() {
        return wasVoted;
    }

    public void setWasVoted(boolean wasVoted) {
        this.wasVoted = wasVoted;
    }
}
