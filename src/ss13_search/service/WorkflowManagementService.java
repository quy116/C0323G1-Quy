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
        List<WorkflowManagement> workflowManagementList = workflowManagementRepository.getDisplayWorkRepository();
        workflowManagementList.forEach(workflowManagement -> System.out.println(workflowManagement));
    }

    @Override
    public void addWorkService() {
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
        workflowManagementRepository.addWorkRepository(workflowManagement);
    }

    @Override
    public void deleteWorkService() {
        List<WorkflowManagement> list = workflowManagementRepository.getDisplayWorkRepository();
        String inputCode = sc.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if (inputCode.equals(list.get(i).getCode())) {
                list.remove(i);
            }
        }
    }

    @Override
    public void editWorkService() {
        deleteWorkService();
        addWorkService();
    }

    @Override
    public void findWorkTrueService() {
        System.out.println("nhap code de tim");
        List<WorkflowManagement> workflowManagementList = workflowManagementRepository.getDisplayWorkRepository();
        String inputCode = sc.nextLine();
        for (int i = 0; i < workflowManagementList.size(); i++) {
            if (inputCode.equals(workflowManagementList.get(i).getCode())){
                System.out.println(workflowManagementList.get(i));
            }
        }
    }

    @Override
    public void findWorkService() {
        System.out.println("nhap name de tim");
        List<WorkflowManagement> workflowManagementList = workflowManagementRepository.getDisplayWorkRepository();
        String inputName = sc.nextLine();
        for (int i = 0; i < workflowManagementList.size(); i++) {
            if (workflowManagementList.get(i).getName().contains(inputName)){
                System.out.println(workflowManagementList.get(i));
            }
        }
    }
}
