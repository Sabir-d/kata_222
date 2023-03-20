package web.dao;

import web.model.Car;

import java.util.List;

public interface Dao {
    public List<Car> cars(int count);
}
