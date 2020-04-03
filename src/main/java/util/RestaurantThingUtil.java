package util;

import model.RestaurantThing;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RestaurantThingUtil {

    public static final List<RestaurantThing> RestaurantThing = Arrays.asList(
            new RestaurantThing("1", "1", 1.2f, LocalDate.now()),
            new RestaurantThing("2", "2", 3.2f, LocalDate.now()),
            new RestaurantThing("3", "3", 3.2f, LocalDate.ofYearDay(2001,1))
    );

    public static List<RestaurantThing> getThisDateRestThings(List<RestaurantThing> restaurantThings, LocalDate localDate) {
        return restaurantThings.stream()
                .filter(restaurantThing -> TimeUtil.isThisDate(restaurantThing.getDate(),
                        LocalDate.now()))
                .collect(Collectors.toList());
    }
}
