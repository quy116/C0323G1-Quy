package ss9_bai_tap_them.repository.manufacturersName;

import ss9_bai_tap_them.model.ManufacturersName;

import java.util.ArrayList;
import java.util.List;

public class ManufacturersNameRepository implements IManufacturersName{
    static List<ManufacturersName> manufacturersNameList = new ArrayList<>();
    static {
        ManufacturersName manufacturersName = new ManufacturersName("001","yamaha","japan");
        manufacturersNameList.add(manufacturersName);
    }


    @Override
    public void addManufacturersName(ManufacturersName manufacturersName) {
        manufacturersNameList.add(manufacturersName);
    }
}
