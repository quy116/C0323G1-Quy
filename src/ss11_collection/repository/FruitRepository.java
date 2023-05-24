package ss11_collection.repository;

import ss11_collection.model.Fruit;

import java.util.HashMap;
import java.util.Map;

public class FruitRepository implements IFruitRepository {
    private static Map<String, Fruit> fruitMap = new HashMap<>();

    static {
        Fruit fruit = new Fruit("001","cam", "sanh", "10-3-2000", "10 ngay", "3k");
        fruitMap.put("cam", fruit);
    }

    @Override
    public void addFruitRepository(Fruit fruit, String name) {
        fruitMap.put(name, fruit);
    }

    @Override
    public Map<String, Fruit> displayFruit() {
        return fruitMap;
    }

    @Override
    public void editFruitRepository(String fruit1) {
        fruitMap.remove(fruit1);
    }

    @Override
    public void deleteFruitRepository(String fruit) {
        fruitMap.remove(fruit);
    }
}
