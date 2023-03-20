package web.model;

import org.springframework.stereotype.Controller;


public class Car {
    private long id;
    private String model;
    private int serial;

    public Car(long id, String model, int serial) {
        this.id = id;
        this.model = model;
        this.serial = serial;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", serial=" + serial +
                '}';
    }
}
