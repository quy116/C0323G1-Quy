package ss14.controller;

import ss14.service.WorkflowManagementService;

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
                    "7. sap xep theo ten tang dan\n" +
                    "8. sap xep theo gia tien\n" +
                    "0. thoat");
            String input = sc.nextLine();
            switch (input) {
                case "1":
                    workflowManagementService.displayWorkflowService();
                    break;
                case "2":
                    workflowManagementService.addWorkflowService();
                    break;
                case "3":
                    System.out.println("nhap code de xoa ");
                    workflowManagementService.deleteWorkflowService();
                    break;
                case "4":
                    System.out.println("nhap code de edit");
                    workflowManagementService.editWorkflowService();
                    break;
                case "5":
                    workflowManagementService.findTrueWorkflowService();
                    break;
                case "6":
                    workflowManagementService.findWorkflowService();
                    break;
                case "7":
                    workflowManagementService.sortWorkflowService();
                case "8":
                    workflowManagementService.sortWorkflowIntService();
                case "0":
                    System.exit(1);
                    break;
                default:
                    System.out.println("moi nhap lai");
                    break;
            }
        } while (true);
    }
}
