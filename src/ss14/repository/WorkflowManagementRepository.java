package ss14.repository;

import ss14.common.ReadAndWrite;
import ss14.model.WorkflowManagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WorkflowManagementRepository implements IWorkflowManagementRepository {
    private Scanner scanner = new Scanner(System.in);
    private ReadAndWrite readAndWrite = new ReadAndWrite();
    private List<WorkflowManagement> workflowManagementList = new ArrayList<>();

    @Override
    public List<WorkflowManagement> getDisplayWorkflowRepository() {
         workflowManagementList = readAndWrite.read();
        return workflowManagementList;
    }

    @Override
    public void addWorkflowRepository(WorkflowManagement workflowManagement) {
        workflowManagementList.add(workflowManagement);
        readAndWrite.write(workflowManagementList);
    }

    @Override
    public List<WorkflowManagement> deleteWorkflowRepository(List<WorkflowManagement> list) {
        workflowManagementList = list;
        readAndWrite.write(list);
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
