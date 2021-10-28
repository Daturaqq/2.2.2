package web.service;

import web.model.Car;

import java.util.List;

public interface carService {
    List<Car> getCarList();
    List<Car> getCarList(int num);
}
