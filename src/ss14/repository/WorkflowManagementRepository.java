package ss14.repository;

import ss14.common.NewReadAndWrite;
import ss14.common.ReadAndWrite;
import ss14.model.WorkflowManagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WorkflowManagementRepository implements IWorkflowManagementRepository {
    private Scanner scanner = new Scanner(System.in);
    private ReadAndWrite readAndWrite = new ReadAndWrite();
    private NewReadAndWrite newReadAndWrite = new NewReadAndWrite();
    private List<WorkflowManagement> workflowManagementList = new ArrayList<>();

    @Override
    public List<WorkflowManagement> getDisplayWorkflowRepository() {
//         workflowManagementList = readAndWrite.read();
         workflowManagementList = NewReadAndWrite.readData();
        return workflowManagementList;
    }

    @Override
    public void addWorkflowRepository(WorkflowManagement workflowManagement) {
        workflowManagementList.add(workflowManagement);
//        readAndWrite.write(workflowManagementList);
        NewReadAndWrite.writeData(workflowManagementList);
    }

    @Override
    public List<WorkflowManagement> deleteWorkflowRepository(List<WorkflowManagement> list) {
        workflowManagementList = list;
        NewReadAndWrite.writeData(workflowManagementList);
//        readAndWrite.write(list);
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
