package ss9_danh_sach.service;

import ss9_danh_sach.model.Fruit;
import ss9_danh_sach.repository.FruitRepository;
import ss9_danh_sach.validate.Regex;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class FruitSv implements IFruitSv {
    Scanner scanner = new Scanner(System.in);
    FruitRepository fruitRepository = new FruitRepository();

    @Override
    public void displaySv() {
        fruitRepository.displayRepo();
    }

    @Override
    public void addSv()  {
        System.out.println("nhap ten trai cay vao");
        String inputName;
        do {
            System.out.println("nhap ten trai cay vao");
            inputName = scanner.nextLine();
        } while (!Regex.regexName(inputName));

        System.out.println("nhap loai trai cay vao");
        String inputKindOfFruit = scanner.nextLine();

        System.out.println("nhap ngay san xuat trai cay vao");
        String inputDateOfManufacture;
        do {
            System.out.println("nhap ngay san xuat trai cay vao");
            inputDateOfManufacture = scanner.nextLine();
        } while (!Regex.regexxDay(inputDateOfManufacture));

        System.out.println("nhap han su dung  trai cay vao");
        String inputExpiry = scanner.nextLine();

        System.out.println("nhap gia san pham vao");
        String inputPrice = scanner.nextLine();

        Fruit fruit = new Fruit(inputName, inputKindOfFruit, inputDateOfManufacture, inputExpiry, inputPrice);
        fruitRepository.addRepo(fruit);
    }
}
