package ss13_search.repository;

import ss13_search.model.WorkflowManagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WorkflowManagementRepository implements IWorkflowManagementRepository {
    private Scanner scanner = new Scanner(System.in);
    private static List<WorkflowManagement> workflowManagementList = new ArrayList<>();

    static {
        WorkflowManagement workflowManagement = new WorkflowManagement("001", "bcs", "11.11.2023", "90k", "dung phe");
        workflowManagementList.add(workflowManagement);
    }

    @Override
    public List<WorkflowManagement> getDisplayRepository() {
        return workflowManagementList;
    }

    @Override
    public void addRepository(WorkflowManagement workflowManagement) {
        workflowManagementList.add(workflowManagement);
    }

    @Override
    public List<WorkflowManagement> deleteRepository(List<WorkflowManagement> list) {
        workflowManagementList = list;
        return workflowManagementList;
    }

}
