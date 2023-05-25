package ss14.repository;

import ss14.model.WorkflowManagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WorkflowManagementRepository implements IWorkflowManagementRepository {
    private Scanner scanner = new Scanner(System.in);
    private static List<WorkflowManagement> workflowManagementList = new ArrayList<>();

    static {
        WorkflowManagement workflowManagement = new WorkflowManagement("001", "bcs", "11.11.2023", 70.0, "dung phe");
        WorkflowManagement workflowManagement1 = new WorkflowManagement("002", "hai", "11.11.2023", 60.0, "dung phe");
        WorkflowManagement workflowManagement2 = new WorkflowManagement("003", "thanh", "11.11.2023", 90.0, "dung phe");
        workflowManagementList.add(workflowManagement);
        workflowManagementList.add(workflowManagement1);
        workflowManagementList.add(workflowManagement2);
    }

    @Override
    public List<WorkflowManagement> getDisplayWorkflowRepository() {
        return workflowManagementList;
    }

    @Override
    public void addWorkflowRepository(WorkflowManagement workflowManagement) {
        workflowManagementList.add(workflowManagement);
    }

    @Override
    public List<WorkflowManagement> deleteWorkflowRepository(List<WorkflowManagement> list) {
        workflowManagementList = list;
        return workflowManagementList;
    }

    @Override
    public List<WorkflowManagement> sortWork(List<WorkflowManagement> list) {
        return list;
    }

    @Override
    public List<WorkflowManagement> sortUpWork(List<WorkflowManagement> list) {
        return list;
    }

}
