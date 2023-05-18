package ss9_bai_tap_them.repository.truck;

import ss9_bai_tap_them.model.Truck;

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
    public void findTruck() {

    }

    @Override
    public void deleteTruck() {

    }
}
