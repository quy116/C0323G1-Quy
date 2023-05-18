package ss9_bai_tap_them.repository.motorbike;

import ss9_bai_tap_them.model.Car;
import ss9_bai_tap_them.model.Motorbike;

public interface IMotorbikeRepository {
    void displapMotorbiker();
    void addMotorbiker(Motorbike motorbike);
    void findMotorbiker();
    void deleteMotorbiker();
}
