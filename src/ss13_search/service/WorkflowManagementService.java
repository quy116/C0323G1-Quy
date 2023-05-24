package ss13_search.service;

import ss13_search.model.WorkflowManagement;
import ss13_search.repository.WorkflowManagementRepository;

import java.util.List;
import java.util.Scanner;

public class WorkflowManagementService implements IWorkflowManagementService {
    private Scanner sc = new Scanner(System.in);
    WorkflowManagementRepository workflowManagementRepository = new WorkflowManagementRepository();


    @Override
    public void displayWorkService() {
        List<WorkflowManagement> workflowManagementList = workflowManagementRepository.getDisplayRepository();
        workflowManagementList.forEach(workflowManagement -> System.out.println(workflowManagement));
    }

    @Override
    public void addService() {
        System.out.println("nhap code");
        String inputCode = sc.nextLine();

        System.out.println("nhap name");
        String inputName = sc.nextLine();

        System.out.println("nhap ngay chi tieu vao");
        String inputDay = sc.nextLine();

        System.out.println("nhap so tien da~ chi tieu vao");
        String inputMoney = sc.nextLine();

        System.out.println("nhap mo ta ve san pham vao");
        String inputComment = sc.nextLine();

        WorkflowManagement workflowManagement = new WorkflowManagement(inputCode, inputName, inputDay, inputMoney, inputComment);
        workflowManagementRepository.addRepository(workflowManagement);
    }

    @Override
    public void deleteService() {
        List<WorkflowManagement> list = workflowManagementRepository.getDisplayRepository();
        String inputCode = sc.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if (inputCode.equals(list.get(i).getCode())) {
                list.remove(i);
            }
        }
    }

    @Override
    public void editService() {
        deleteService();
        addService();
    }

    @Override
    public void findTrueService() {
        System.out.println("nhap code de tim");
        List<WorkflowManagement> workflowManagementList = workflowManagementRepository.getDisplayRepository();
        String inputCode = sc.nextLine();
        for (int i = 0; i < workflowManagementList.size(); i++) {
            if (inputCode.equals(workflowManagementList.get(i).getCode())){
                System.out.println(workflowManagementList.get(i));
            }
        }
    }

    @Override
    public void findService() {
        System.out.println("nhap code de tim");
        List<WorkflowManagement> workflowManagementList = workflowManagementRepository.getDisplayRepository();
        String inputCode = sc.nextLine();
        for (int i = 0; i < workflowManagementList.size(); i++) {
            if (workflowManagementList.get(i).getCode().contains(inputCode)){
                System.out.println(workflowManagementList.get(i));
            }
        }
    }
}
