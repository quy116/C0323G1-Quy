package ss9_danh_sach.controller;

import ss9_danh_sach.service.FruitSv;

import java.util.Scanner;

public class Menu {
    public void display() {
        FruitSv fruitSv = new FruitSv();
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("nhap lua chon\n" +
                    "1. display\n" +
                    "2. add \n" +
                    "3. exit");
            String input = scanner.nextLine();
            switch (input) {
                case "1":
                    fruitSv.displaySv();
                    break;
                case "2":
                    fruitSv.addSv();
                    break;
                case "3":
                    flag = false;
                    break;
                default:
                    System.out.println("moi nhap lai");
                    break;
            }
        } while (flag);
    }
}
