package ss14.common;

import ss14.model.WorkflowManagement;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    private String Path = "src/ss14/common/Work.csv";

    public void write(List<WorkflowManagement> workflowManagementList) {
        File file = new File(Path);
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (WorkflowManagement e : workflowManagementList) {
                bufferedWriter.write(e.getToInfoCsv());
                bufferedWriter.newLine();
                bufferedWriter.flush();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public List<WorkflowManagement> read() {
        List<WorkflowManagement> workflowManagementList = new ArrayList<>();
        File file = new File(Path);
        FileReader fileReader = null;
        try {

             fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null && !line.equals("")) {
                String[] arr = line.split(",");
                WorkflowManagement workflowManagement = new WorkflowManagement(arr[0], arr[1], arr[2], Double.parseDouble(arr[3]), arr[4]);
                workflowManagementList.add(workflowManagement);
            }
            bufferedReader.close();
            fileReader.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return workflowManagementList;
    }
}
