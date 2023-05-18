package ss9_bai_tap_them.repository.motorbike;

import ss9_bai_tap_them.model.Motorbike;

import java.util.ArrayList;
import java.util.List;

public class MotorbikeRepository implements IMotorbikeRepository {
    private static List<Motorbike> motorbikeList = new ArrayList<>();

    static {
        Motorbike motorbike = new Motorbike("92S2-5388", "yamaha", "2008", "meu meu", "1000");
        motorbikeList.add(motorbike);
    }

    @Override
    public void displapMotorbiker() {
        for (Motorbike e : motorbikeList) {
            System.out.println(e);
        }
    }

    @Override
    public void addMotorbiker(Motorbike motorbike) {
        motorbikeList.add(motorbike);
    }

    @Override
    public void findMotorbiker() {

    }

    @Override
    public void deleteMotorbiker() {

    }
}
