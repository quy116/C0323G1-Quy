package ss13_search.repository;

import ss13_search.model.WorkflowManagement;

import java.util.List;

public interface IWorkflowManagementRepository {
    List<WorkflowManagement> getDisplayWorkRepository();
    void addWorkRepository(WorkflowManagement workflowManagement);
    List<WorkflowManagement> deleteWorkRepository(List<WorkflowManagement> list);
}
