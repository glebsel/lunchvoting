package DLVS.repository;

import DLVS.model.RestaurantThing;
import java.util.Collection;

public interface ThingRepository {
    void add(RestaurantThing thing);
    Collection<RestaurantThing> getAll();
}
