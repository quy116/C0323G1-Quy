package ss9_bai_tap_them.repository.car;

import ss9_bai_tap_them.model.Car;

public interface ICarRepository {
    void displayCar();
    void addCar(Car car);
    boolean findCar(String input);
    void deleteCar(String input);
}
