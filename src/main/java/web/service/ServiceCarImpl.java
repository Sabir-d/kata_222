package web.service;

import org.springframework.stereotype.Component;
import web.dao.Dao;
import web.dao.DaoCarslmpl;
import web.model.Car;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class ServiceCarImpl implements ServiceCar {
    Dao dao = new DaoCarslmpl();


    public List<Car> cars(int count) {
        return dao.cars(count);
    }

}
