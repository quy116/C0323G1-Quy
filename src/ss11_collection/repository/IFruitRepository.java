package ss11_collection.repository;

import ss11_collection.model.Fruit;

import java.util.Map;

public interface IFruitRepository {
    void addFruitRepository(Fruit fruit, String name);
    Map<String, Fruit> displayFruit();
    void editFruitRepository(String fruit1);
    void deleteFruitRepository(String fruit);
}
