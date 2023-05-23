package ss11_collection.service;

import ss11_collection.model.Fruit;
import ss11_collection.repository.FruitRepository;

import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class FruitService implements IFruitService{
    private Scanner sc = new Scanner(System.in);
    private FruitRepository fruitRepository = new FruitRepository();
//    String name, String kindOfFruit, String dateOfManufacture, String expiry, String price
    @Override
    public void addService() {
        System.out.println("nhap ten trai cay vao");
        String inputName = sc.nextLine();
        System.out.println("nhap loai trai cay vao");
        String inputKindOfFruit = sc.nextLine();
        System.out.println("nhap ngay san xuat trai cay vao");
        String inputDateOfManufacture = sc.nextLine();
        System.out.println("nhap ngay het han trai cay vao");
        String inputExpiry = sc.nextLine();
        System.out.println("nhap gia trai cay vao");
        String inputPrice = sc.nextLine();
        Fruit fruit = new Fruit(inputName,inputKindOfFruit,inputDateOfManufacture,inputExpiry,inputPrice);
        fruitRepository.addRepository(fruit,inputName);
    }

    @Override
    public void deleteService() {
        Map<String,Fruit> fruitMap = fruitRepository.display();
        System.out.println("nhap ten ten de xoa");
        String input = sc.nextLine();
        Set<String> strings = fruitMap.keySet();
        for (String e :strings) {
            if (input.equals(e)){
                fruitRepository.deleteRepository(e);
            }
        }
    }

    @Override
    public void editService() {
    String input = sc.nextLine();
    }

    @Override
    public void display() {
       Map<String,Fruit> fruitMap = fruitRepository.display();
        Set<String> strings = fruitMap.keySet();
        for (String e: strings ) {
            System.out.println("ten :" + e + " " + fruitMap.get(e));
        }
    }
}
