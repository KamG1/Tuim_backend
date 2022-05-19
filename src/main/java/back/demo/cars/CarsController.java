package back.demo.cars;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping
public class CarsController {

    private final CarService carService;

    @GetMapping("/getCars")
    public List<CarResponse> getCars() {
        return carService.getCars();
    }

    @PostMapping("/addCar")
    public void addCar(@RequestBody CarRequest request) {
        carService.addCar(request);
    }

    @PostMapping("/deleteCar")
    public void deleteCar(@RequestBody CarRequest request) {
        carService.deleteCar(request);
    }


}
