package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class carServiceImp implements carService {
    private List<Car> carList;

    public carServiceImp() {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("Tesla", "Elon", 1337));
        carList.add(new Car("SomeCar", "SomeGuy", 0));
        carList.add(new Car("SuperCar", "SuperMan", 1));
        carList.add(new Car("Batmobile", "Batman", 2));
        carList.add(new Car("Lada", "Vasya", 777));
        this.carList = carList;
    }

    @Override
    public List<Car> getCarList() {
        return carList;
    }

    @Override
    public List<Car> getCarList(int num) {
        try {
            return num >= 0 ? getCarList() : carList.subList(0, num);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Less then 0");
            throw new IndexOutOfBoundsException();
        }
    }
}
