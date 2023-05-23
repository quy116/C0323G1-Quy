package ss9_bai_tap_them.service.motorbike;

import ss9_bai_tap_them.model.ManufacturersName;
import ss9_bai_tap_them.model.Motorbike;
import ss9_bai_tap_them.repository.manufacturersName.ManufacturersNameRepository;
import ss9_bai_tap_them.repository.motorbike.MotorbikeRepository;

import java.util.Scanner;

public class MotorbikeService implements IMotorbike{
    private MotorbikeRepository motorbikeRepository = new MotorbikeRepository();
    private Scanner sc = new Scanner(System.in);
    @Override
    public void displayMotorbike() {
        motorbikeRepository.displapMotorbiker();
    }

    @Override
    public void addMotorbike() {
        System.out.println("nhap bien kiem soat");
        String inputControl = sc.nextLine();

        System.out.println("nhap ten hang~ san xuat vao");
        String inputFacturers = sc.nextLine();

        System.out.println("nhap ma hang san xuat vao");
        String inputCode = sc.nextLine();


        System.out.println("nhap ten quoc gia  san xuat vao");
        String inputCountry = sc.nextLine();
        ManufacturersName manufacturersName = new ManufacturersName(inputCode, inputFacturers,inputCountry);
        ManufacturersNameRepository manufacturersNameRepository = new ManufacturersNameRepository();
        manufacturersNameRepository.addManufacturersName(manufacturersName);


        System.out.println("nhap nam san xuat vao");
        String inputYear = sc.nextLine();

        System.out.println("nhap chu so huu vao");
        String inputOwner = sc.nextLine();

        System.out.println("nhap cong suat xe vao");
        String inputWattage = sc.nextLine();
        Motorbike motorbike = new Motorbike(inputControl,inputFacturers,inputYear,inputOwner,inputWattage);
        motorbikeRepository.addMotorbiker(motorbike);
    }


}
