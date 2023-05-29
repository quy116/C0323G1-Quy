package ss14.common;

import ss14.model.WorkflowManagement;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class NewReadAndWrite {
    public static final String PATH = "/Users/gaugaune/IdeaProjects/HocLai-mdule2/src/ss14/common/Work.dat";
    public static void writeData(List<WorkflowManagement> workflowManagementList){
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(PATH);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(workflowManagementList);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static List<WorkflowManagement> readData(){
        List<WorkflowManagement> workflowManagementList = new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream(PATH);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            workflowManagementList = (List<WorkflowManagement>) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println("file roongx");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return workflowManagementList;
    }
}
