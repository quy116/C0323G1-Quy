package ss13_search.controller;

import ss13_search.service.WorkflowManagementService;

import java.util.Scanner;

public class Menu {
    public void display() {
        WorkflowManagementService workflowManagementService = new WorkflowManagementService();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1. hien thi \n" +
                    "2. them \n" +
                    "3. xoa \n" +
                    "4. edit \n" +
                    "5. tim kiem \n" +
                    "6. tim kiem gan dung \n" +
                    "0. thoat");
            String input = sc.nextLine();
            switch (input) {
                case "1":
                    workflowManagementService.displayWorkService();
                    break;
                case "2":
                    workflowManagementService.addService();
                    break;
                case "3":
                    System.out.println("nhap code de xoa ");
                    workflowManagementService.deleteService();
                    break;
                case "4":
                    System.out.println("nhap code de edit");
                    workflowManagementService.editService();
                    break;
                case "5":
                    workflowManagementService.findTrueService();
                    break;
                case "6":
                    workflowManagementService.findService();
                    break;
                case "0":
                    System.exit(1);
                default:
                    System.out.println("moi nhap lai");
                    break;
            }
        } while (true);
    }
}
