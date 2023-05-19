package ss9_bai_tap_them.repository.truck;

import ss9_bai_tap_them.model.Motorbike;
import ss9_bai_tap_them.model.Truck;

public interface ITruckRepository {
    void displayTruck();
    void addTruck(Truck truck);
    boolean findTruck(String input);
    void deleteTruck(String input);
}
