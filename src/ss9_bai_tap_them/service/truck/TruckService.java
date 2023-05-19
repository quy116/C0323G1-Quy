package ss9_bai_tap_them.service.truck;

import ss9_bai_tap_them.model.ManufacturersName;
import ss9_bai_tap_them.model.Truck;
import ss9_bai_tap_them.repository.manufacturersName.ManufacturersNameRepository;
import ss9_bai_tap_them.repository.truck.TruckRepository;

import java.util.Scanner;

public class TruckService implements ITruck {
    private TruckRepository truckRepository = new TruckRepository();
    private Scanner sc = new Scanner(System.in);

    @Override
    public void displayTruck() {
        truckRepository.displayTruck();
    }

    @Override
    public void addTruck() {
        System.out.println("nhap bien kiem soat");
        String inputControl = sc.nextLine();

        System.out.println("nhap ten hang~ san xuat");
        String inputFacturers = sc.nextLine();

        System.out.println("nhap ma hang san xuat vao");
        String inputCode = sc.nextLine();


        System.out.println("nhap ten quoc gia  san xuat vao");
        String inputCountry = sc.nextLine();
        ManufacturersName manufacturersName = new ManufacturersName(inputCode, inputFacturers, inputCountry);
        ManufacturersNameRepository manufacturersNameRepository = new ManufacturersNameRepository();
        manufacturersNameRepository.addManufacturersName(manufacturersName);


        System.out.println("nhap nam san xuat vao");
        String inputYear = sc.nextLine();

        System.out.println("nhap chu so huu vao");
        String inputOwner = sc.nextLine();

        System.out.println("nhap trong tai vao");
        String inputRefereer = sc.nextLine();

        Truck truck = new Truck(inputControl, inputFacturers, inputYear, inputOwner, inputRefereer);
        truckRepository.addTruck(truck);
    }

    @Override
    public void findTruck() {

    }

    @Override
    public void deleteTruck() {

    }
}
