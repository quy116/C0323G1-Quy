package ss9_bai_tap_them.controller;

import ss9_bai_tap_them.service.car.CarService;
import ss9_bai_tap_them.service.motorbike.MotorbikeService;
import ss9_bai_tap_them.service.truck.TruckService;

import java.util.Scanner;

public class MenuController {
    public void display() {
        Scanner sc = new Scanner(System.in);
        CarService carService = new CarService();
        MotorbikeService motorbikeService = new MotorbikeService();
        TruckService truckService = new TruckService();
        boolean flag = true;
        do {
            System.out.println("moi chon chuc nang \n" +
                    "1.add \n" +
                    "2. display \n" +
                    "3.delete\n" +
                    "4. find \n" +
                    "5. exit");
            String input = sc.nextLine();
            switch (input){
                case "1":
                    System.out.println("1. add Car \n" +
                            "2. add motobike \n" +
                            "3. add truck \n " +
                            "4. exit");
                    String inputAdd = sc.nextLine();
                    switch (inputAdd){
                        case "1":
                            carService.addCar();
                            break;
                        case "2":
                            motorbikeService.addMotorbike();
                            break;
                        case "3":
                            truckService.addTruck();
                            break;
                        case "4":
                            break;
                        default:
                            System.out.println("moi nhap lai");
                    }
                    break;
                case "2":
                    System.out.println("1. display Car \n" +
                            "2. display motobike \n" +
                            "3. display truck \n " +
                            "4. exit");
                    String inputDisplay = sc.nextLine();
                    switch (inputDisplay){
                        case "1":
                            carService.displayCar();
                            break;
                        case "2":
                            motorbikeService.displayMotorbike();
                            break;
                        case "3":
                            truckService.displayTruck();
                            break;
                        case "4":
                            break;
                        default:
                            System.out.println("moi nhap lai");
                    }
                    break;
                case "3":
                    break;
                case "4":
                    break;
                case "5":
                    break;
            }
        }while (flag);
    }
}
