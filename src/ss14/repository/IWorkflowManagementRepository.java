package ss14.repository;

import ss14.model.WorkflowManagement;

import java.util.List;

public interface IWorkflowManagementRepository {
    List<WorkflowManagement> getDisplayWorkflowRepository();

    void addWorkflowRepository(WorkflowManagement workflowManagement);

    List<WorkflowManagement> deleteWorkflowRepository(List<WorkflowManagement> list);

    List<WorkflowManagement> sortWork(List<WorkflowManagement> list);

    List<WorkflowManagement> sortUpWork(List<WorkflowManagement> list);
}
