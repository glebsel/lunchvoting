
package util;

import model.RestaurantThing;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RestaurantThingUtil {

    public static ArrayList<RestaurantThing> restaurantThings = new ArrayList<RestaurantThing>();

    static {
        restaurantThings.add(new RestaurantThing("1", "1", 1.2f, LocalDate.now()));
        restaurantThings.add(new RestaurantThing("2", "2", 3.2f, LocalDate.now()));
        restaurantThings.add(new RestaurantThing("3", "3", 3.2f, LocalDate.ofYearDay(2001,1)));
    }

    public static List<RestaurantThing> getThisDateRestThings(List<RestaurantThing> restaurantThings, LocalDate localDate) {
        return restaurantThings.stream()
                .filter(restaurantThing -> TimeUtil.isThisDate(restaurantThing.getDate(),
                        LocalDate.now()))
                .collect(Collectors.toList());
    }

    public static void add(RestaurantThing thing){
        restaurantThings.add(thing);
    }

    public static void changeVoted(Integer id){
        RestaurantThing thingWasVoted = restaurantThings.stream()
                .filter(x -> x.getWasVoted() == true)
                .findAny()
                .orElse(null);
        if (thingWasVoted != null)
            thingWasVoted.setWasVoted(false);
        thingWasVoted = restaurantThings.stream()
                .filter(x -> x.getId() == id)
                .findAny()
                .orElse(null);
        if (thingWasVoted != null)
            thingWasVoted.setWasVoted(true);
    }
}
