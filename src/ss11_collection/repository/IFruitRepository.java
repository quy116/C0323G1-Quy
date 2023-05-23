package ss11_collection.repository;

import ss11_collection.model.Fruit;

import java.util.Map;

public interface IFruitRepository {
    void addRepository(Fruit fruit, String name);
    Map<String, Fruit> display();
    void editRepository();
    void deleteRepository(String fruit);
}
