package ss9_bai_tap_them.repository.truck;

import ss9_bai_tap_them.model.Truck;
import ss9_bai_tap_them.service.car.CarService;

import java.util.ArrayList;
import java.util.List;

public class TruckRepository implements ITruckRepository {
    private static List<Truck> truckList = new ArrayList<>();

    static {
        Truck truck = new Truck("92S2-5388", "yamaha", "2008", "meu meu", "100000");
        truckList.add(truck);
    }


    @Override
    public void displayTruck() {
        for (Truck e : truckList) {
            System.out.println(e);
        }
    }

    @Override
    public void addTruck(Truck truck) {

    }

    @Override
    public boolean findTruck(String input) {
        boolean flag = false;
        for (int i = 0; i < truckList.size(); i++) {
            if (input.equals(truckList.get(i).getSeaOfControl())) {
                System.out.println("Truck :  " + truckList.get(i));
                flag = true;
            }
        }
//        CarService carService = new CarService();
//        carService.deleteCar(flag);
        return flag;


    }

    @Override
    public void deleteTruck(String input) {
        for (int i = 0; i < truckList.size(); i++) {
            if (input.equals(truckList.get(i).getSeaOfControl())) {
                truckList.remove(i);
            }
//
        }
     }
}
