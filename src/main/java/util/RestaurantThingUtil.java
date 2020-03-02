package util;

import model.RestaurantThing;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class RestaurantThingUtil {
    public static List<RestaurantThing> getThisDateRestThings(List<RestaurantThing> restaurantThings, LocalDate localDate) {
        return restaurantThings.stream()
                .filter(restaurantThing -> TimeUtil.isThisDate(restaurantThing.getDate(),
                        localDate))
                .collect(Collectors.toList());
    }
}
