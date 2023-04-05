package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao {
    private static final List<Car> carList = new ArrayList<>();

    static {
        carList.add(new Car("Toyota Mark II", "White", 1991, 210_000.00));
        carList.add(new Car("nissan skyline r34", "Blue", 1998, 1_945_000));
        carList.add(new Car("Honda Civic", "black",  1997 , 340_000.00));
        carList.add(new Car("nissan 180sx", "silver", 2017, 984_000.00));
        carList.add(new Car("Mitsubishi Evo VI", "Red", 1997, 1_900_000));
    }

    @Override
    public List<Car> getCars(int count) {
        if (count == 0) {
            return carList;
        }

        return carList.stream().limit(count).collect(Collectors.toList());
    }
}
