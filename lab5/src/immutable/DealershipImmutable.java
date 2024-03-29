package immutable;

import java.util.ArrayList;
import java.util.List;

public final class DealershipImmutable {
    private final List<Car> cars;

    public DealershipImmutable(List<Car> cars)
    {
        this.cars = new ArrayList<>(cars);
    }

    public List<Car> getCars()
    {
        return new ArrayList<>(cars);
    }

}
