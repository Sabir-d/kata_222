package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;



public class DaoCarslmpl implements Dao {
    private List<Car> car;
    private static long id;

    public DaoCarslmpl() {
        car = new ArrayList<>();
        car.add(new Car(++id, "test1", 121));
        car.add(new Car(++id, "test2", 122));
        car.add(new Car(++id, "test3", 123));
        car.add(new Car(++id, "test4", 124));
        car.add(new Car(++id, "test5", 125));
    }

    public List<Car> cars(int count) {
        if (count > 5) {
            count = 5;
        }
        return car.subList(0, count);
    }

}
