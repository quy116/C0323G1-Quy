package ss9_danh_sach.repository;

import ss9_danh_sach.model.Fruit;
import ss9_danh_sach.until.readAndWriter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FruitRepository implements IFruit {
    Scanner scanner = new Scanner(System.in);
    private List<Fruit> fruitArrayList = new ArrayList<>();

    @Override
    public void displayRepo() {
        fruitArrayList = readAndWriter.fruitsRead();
        for (Fruit e : fruitArrayList) {
            System.out.println(e);
        }
    }

    @Override
    public void addRepo(Fruit fruit) {
        fruitArrayList.add(fruit);
        readAndWriter.writer(fruitArrayList);
    }


}
