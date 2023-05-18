package ss9_bai_tap_them.repository.car;

import ss9_bai_tap_them.model.Car;
import ss9_bai_tap_them.service.car.ICarService;

import java.util.ArrayList;
import java.util.List;

public class CarRepository implements ICarRepository {
    private static List<Car> carList = new ArrayList<>();
    static {
        Car car = new Car("92S2-5388","yamaha","2008","meu meu","7","du lich");
        carList.add(car);
    }
    @Override
    public void displayCar() {
        for (Car car: carList) {
            System.out.println(car);
        }
    }

    @Override
    public void addCar(Car car) {
        carList.add(car);
    }


    @Override
    public void findCar() {

    }

    @Override
    public void deleteCar() {

    }
}
