package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImpl implements CarService {

    private List<Car> cars = List.of(new Car("yellow", 1950, "Volvo"),
                                    new Car("white", 1960, "Granta"),
                                    new Car("black", 1970, "BMW"),
                                    new Car("red", 1980, "Volga"),
                                    new Car("blue", 1990, "Volkswagen"));

    @Override
    public List<Car> carList(int count) {
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
