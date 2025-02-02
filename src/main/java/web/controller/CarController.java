package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
public class CarController {

    private final CarService carServiceImpl;

    public CarController(CarService carServiceImpl) {
        this.carServiceImpl = carServiceImpl;
    }

    @GetMapping("/cars")
    public String carController(@RequestParam(defaultValue = "5") int count, ModelMap model) {
        model.addAttribute("cars", carServiceImpl.carList(count));
        return "cars";
    }
}
