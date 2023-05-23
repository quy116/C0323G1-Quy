package ss11_collection.repository;

import ss11_collection.model.Fruit;

import java.util.HashMap;
import java.util.Map;

public class FruitRepository implements IFruitRepository {
    private static Map<String, Fruit> fruitMap = new HashMap<>();

    static {
        Fruit fruit = new Fruit("cam", "sanh", "10-3-2000", "10 ngay", "3k");
        fruitMap.put("cam", fruit);
    }

    @Override
    public void addRepository(Fruit fruit, String name) {
        fruitMap.put(name, fruit);
    }

    @Override
    public Map<String, Fruit> display() {
        return fruitMap;
    }

    @Override
    public void editRepository(String fruit1) {
        fruitMap.remove(fruit1);
    }

    @Override
    public void deleteRepository(String fruit) {
        fruitMap.remove(fruit);
    }
}
