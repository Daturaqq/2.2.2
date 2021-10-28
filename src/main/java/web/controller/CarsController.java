package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.carServiceImp;

import java.util.List;
import java.util.Objects;

@Controller
public class CarsController {

    @GetMapping(value = "/cars")
    public String gettingCar(@RequestParam(required = false) Integer count, ModelMap model) {
        carServiceImp carService = new carServiceImp();
        List<Car> cars;
        if (Objects.isNull(count)) {
            cars = carService.getCarList();
        } else {
            cars = carService.getCarList(count);
        }
        model.addAttribute("cars", cars);
        return "cars";
    }
}
