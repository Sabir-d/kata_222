package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.ServiceCar;
import web.service.ServiceCarImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarsController {

    private final ServiceCar serviceCar;

    @Autowired
    public CarsController(ServiceCar serviceCar) {
        this.serviceCar = serviceCar;
    }


    @GetMapping()
    public String cars(@RequestParam(value = "count", defaultValue = "5") int count,ModelMap model) {

        model.addAttribute("cars", serviceCar.cars(count));

        return "cars";
    }
}
