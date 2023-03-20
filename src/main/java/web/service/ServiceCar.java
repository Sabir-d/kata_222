package web.service;

import web.model.Car;

import java.util.List;

public interface ServiceCar {
    public List<Car> cars(int count);
}
