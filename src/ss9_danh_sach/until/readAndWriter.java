package ss9_danh_sach.until;

import ss9_danh_sach.model.Fruit;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class  readAndWriter {
    public static void writer(List<Fruit> fruitList){
        File file = new File("src/ss9_danh_sach/until/data.csv");
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Fruit e: fruitList) {
                bufferedWriter.write(e.readToFile());
                bufferedWriter.newLine();
                bufferedWriter.flush();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static List<Fruit> fruitsRead(){
        List<Fruit> fruitList = new ArrayList<>();
        File file = new File("src/ss9_danh_sach/until/data.csv");
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine())!= null && !line.equals("")){
                String[] arr = line.split(",");
                Fruit fruit = new Fruit(arr[0],arr[1],arr[2],arr[3],arr[4]);
                fruitList.add(fruit);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return fruitList;
    }
    public static List<Fruit> fruitsRead1(){
        List<Fruit> fruitList = new ArrayList<>();
        File file = new File("src/ss9_danh_sach/until/data.csv");
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine())!= null && line.equals("")){
                String[] arr = line.split(",");
                Fruit fruit = new Fruit(arr[0],arr[1],arr[2],arr[3],arr[0]);
                fruitList.add(fruit);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return fruitList;
    }
}
