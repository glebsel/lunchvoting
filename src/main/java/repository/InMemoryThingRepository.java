package repository;

import model.RestaurantThing;
import util.RestaurantThingUtil;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class InMemoryThingRepository implements ThingRepository {
    @Override
    public void add(RestaurantThing thing) {
    }

    @Override
    public Collection<RestaurantThing> getAll() {
        return null;
    }
}
