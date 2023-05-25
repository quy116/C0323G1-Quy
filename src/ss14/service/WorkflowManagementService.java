package ss14.service;

import ss14.model.WorkflowManagement;
import ss14.repository.WorkflowManagementRepository;

import java.io.IOException;
import java.util.*;

public class WorkflowManagementService implements IWorkflowManagementService {
    private Scanner sc = new Scanner(System.in);
    WorkflowManagementRepository workflowManagementRepository = new WorkflowManagementRepository();


    @Override
    public void displayWorkflowService() {
        List<WorkflowManagement> workflowManagementList = workflowManagementRepository.getDisplayWorkflowRepository();
        workflowManagementList.forEach(workflowManagement -> System.out.println(workflowManagement));
    }

    @Override
    public void addWorkflowService() {
        List<WorkflowManagement> workflowManagementList = workflowManagementRepository.getDisplayWorkflowRepository();
        boolean flag = false;
        String inputCode;
        do {
            System.out.println("nhap code");
            inputCode = sc.nextLine();
            try {
                for (int i = 0; i < workflowManagementList.size(); i++) {
                    if (inputCode.equals(workflowManagementList.get(i).getCode())) {
                        throw new UniqueException("trung id");
                    }
                }
                flag = true;

            } catch (UniqueException e) {
                System.err.println("UniqueException. xin moi nhap lai");
            }
        } while (!flag);
        System.out.println("nhap name");
        String inputName = sc.nextLine();

        System.out.println("nhap ngay chi tieu vao");
        String inputDay = sc.nextLine();

        System.out.println("nhap so tien da~ chi tieu vao");
        Double inputMoney = Double.valueOf(sc.nextLine());

        System.out.println("nhap mo ta ve san pham vao");
        String inputComment = sc.nextLine();

        WorkflowManagement workflowManagement = new WorkflowManagement(inputCode, inputName, inputDay, inputMoney, inputComment);
        workflowManagementRepository.addWorkflowRepository(workflowManagement);
    }

    @Override
    public void deleteWorkflowService() {
        List<WorkflowManagement> list = workflowManagementRepository.getDisplayWorkflowRepository();
        boolean flag = false;
        String inputCode;
        do {
            inputCode = sc.nextLine();
            int check = 0;
            try {
                for (int i = 0; i < list.size(); i++) {
                    if (inputCode.equals(list.get(i).getCode())) {
                        check++;
                        break;
                    }
                }
                if (check == 0) {
                    throw new IdNotFoundException("khong co id");
                }else{
                    flag = true;
                }
            } catch (IdNotFoundException e) {
                System.err.println("IdNotFoundException. moi nhap lai");
            }
        } while (!flag);
        for (int i = 0; i < list.size(); i++) {
            if (inputCode.equals(list.get(i).getCode())) {
                list.remove(i);
            }
        }
    }

    @Override
    public void editWorkflowService() {
        deleteWorkflowService();
        addWorkflowService();
    }

    @Override
    public void findTrueWorkflowService() {
        System.out.println("nhap code de tim");
        List<WorkflowManagement> workflowManagementList = workflowManagementRepository.getDisplayWorkflowRepository();
        String inputCode = sc.nextLine();
        for (int i = 0; i < workflowManagementList.size(); i++) {
            if (inputCode.equals(workflowManagementList.get(i).getCode())) {
                System.out.println(workflowManagementList.get(i));
            }
        }
    }

    @Override
    public void findWorkflowService() {
        System.out.println("nhap code de tim");
        List<WorkflowManagement> workflowManagementList = workflowManagementRepository.getDisplayWorkflowRepository();
        String inputCode = sc.nextLine();
        for (int i = 0; i < workflowManagementList.size(); i++) {
            if (workflowManagementList.get(i).getCode().contains(inputCode)) {
                System.out.println(workflowManagementList.get(i));
            }
        }
    }

    @Override
    public void sortWorkflowService() {
        List<WorkflowManagement> list = workflowManagementRepository.getDisplayWorkflowRepository();
        Collections.sort(list, new Comparator<WorkflowManagement>() {
            @Override
            public int compare(WorkflowManagement o1, WorkflowManagement o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        List<WorkflowManagement> newList = workflowManagementRepository.sortWork(list);
        for (WorkflowManagement e : newList) {
            System.out.println(e);
        }
    }

    public void sortWorkflowIntService() {
        List<WorkflowManagement> list = workflowManagementRepository.getDisplayWorkflowRepository();
        Collections.sort(list, new Comparator<WorkflowManagement>() {
            @Override
            public int compare(WorkflowManagement o1, WorkflowManagement o2) {
                if (o1.getMoney() == o2.getMoney()) {
                    return o1.getName().compareTo(o2.getName());
                } else if (o1.getMoney() > o2.getMoney()) {
                    return 1;
                } else {
                    return -1;
                }
            }
        });
        List<WorkflowManagement> newList = workflowManagementRepository.sortWork(list);
        for (WorkflowManagement e : newList) {
            System.out.println(e);
        }
    }
}
