package ss13_search.repository;

import ss13_search.model.WorkflowManagement;

import java.util.List;

public interface IWorkflowManagementRepository {
    List<WorkflowManagement> getDisplayRepository();
    void addRepository(WorkflowManagement workflowManagement);
    List<WorkflowManagement> deleteRepository(List<WorkflowManagement> list);
}
