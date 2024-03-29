package immutable;
import java.util.ArrayList;
import java.util.List;

public class ApplicationImmutable
{
    public static void main(String[] args)
    {
        Car car1 = new Car("Toyota Camry", 2022);
        Car car2 = new Car("Honda Civic", 2021);

        List<Car> carsList = new ArrayList<>();
        carsList.add(car1);
        carsList.add(car2);

        DealershipImmutable dealership = new DealershipImmutable(carsList);

        System.out.println("Masinile din dealership:");
        for (Car car : dealership.getCars())
        {
            System.out.println(car);
        }
    }
}
