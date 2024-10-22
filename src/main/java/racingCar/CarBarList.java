package racingCar;

import java.util.ArrayList;

public class CarBarList {
    private ArrayList<Car> CARS = new ArrayList<>();

    public CarBarList(ArrayList<String> cars) {
        cars.forEach(car->CARS.add(new Car(car)));
    }
}
