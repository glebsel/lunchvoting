package DLVS.repository.inmemory;

import DLVS.model.RestaurantThing;
import DLVS.repository.ThingRepository;

import java.util.Collection;

public class InMemoryThingRepository implements ThingRepository {
    @Override
    public void add(RestaurantThing thing) {
    }

    @Override
    public Collection<RestaurantThing> getAll() {
        return null;
    }
}
