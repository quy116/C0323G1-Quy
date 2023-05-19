package ss9_bai_tap_them.service.car;

import ss9_bai_tap_them.model.Car;
import ss9_bai_tap_them.model.ManufacturersName;
import ss9_bai_tap_them.repository.car.CarRepository;
import ss9_bai_tap_them.repository.manufacturersName.ManufacturersNameRepository;
import ss9_bai_tap_them.repository.motorbike.MotorbikeRepository;
import ss9_bai_tap_them.repository.truck.TruckRepository;

import java.util.Scanner;

public class CarService implements ICarService {
    Scanner sc = new Scanner(System.in);
    CarRepository carRepository = new CarRepository();
    TruckRepository truckRepository = new TruckRepository();
    MotorbikeRepository motorbikeRepository = new MotorbikeRepository();

    //String seaOfControl, String manufacturersName, String year, String owner, String numberOfSeats, String typeCar
    @Override
    public void displayCar() {
        carRepository.displayCar();
    }

    @Override
    public void addCar() {
        System.out.println("nhap bien kiem soat");
        String inputControl = sc.nextLine();


        System.out.println("nhap ten hang~ san xuat vao");
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

        System.out.println("nhap so cho ngoi cua xe vao");
        String inputSeats = sc.nextLine();

        System.out.println("nhap kieu xe vao(xe du lich, xe khach) soat");
        String inputType = sc.nextLine();
        Car car = new Car(inputControl, inputFacturers, inputYear, inputOwner, inputSeats, inputType);
        carRepository.addCar(car);

    }

    @Override
    public void findCar() {
        System.out.println("nhap bien kiem soat de tim ");
        String input = sc.nextLine();
        carRepository.findCar(input);
        motorbikeRepository.findMotorbiker(input);
        truckRepository.findTruck(input);

    }

    @Override
    public void deleteCar() {
        System.out.println("nhap bien kiem soat de xoa ");
        String input = sc.nextLine();
        boolean car = carRepository.findCar(input);
        boolean motobike = motorbikeRepository.findMotorbiker(input);
        boolean truck = truckRepository.findTruck(input);
        if (car == true || motobike == true || truck == true) {
            System.out.println("co ton tai trong  mang : \n" +
                    "1. yes \n" +
                    "2. no");
            String choice = sc.nextLine();
            if (choice.equals("1")){
                carRepository.deleteCar(input);
                motorbikeRepository.deleteMotorbiker(input);
                truckRepository.deleteTruck(input);
                System.out.println("xoa thanh cong");
            }
        }
    }
}
