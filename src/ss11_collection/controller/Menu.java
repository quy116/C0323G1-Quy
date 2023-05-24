package ss11_collection.controller;

import ss11_collection.repository.FruitRepository;
import ss11_collection.service.FruitService;

import java.util.Scanner;

public class Menu {
    public void displayFruit() {
        FruitService fruitService = new FruitService();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1. hien thi \n" +
                    "2. them trai cay \n" +
                    "3. xoa trai cay \n" +
                    "4. sua thong tin trai cay\n" +
                    "0. exit");
            String input = sc.nextLine();
            switch (input){
                case "1":
                    fruitService.displayFruit();
                    break;
                case "2":
                    fruitService.addFruitService();
                    break;
                case "3":
                    fruitService.deleteFruitService();
                    break;
                case "4":
                    fruitService.editFruitService();
                    break;
                case "0":
                    System.exit(0);
                default:
                    System.out.println("nhap lai");
            }
        }while (true);
    }
}
