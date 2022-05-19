package back.demo.cars;

import org.springframework.stereotype.Component;

@Component
public class CarToResponseMapper {

    public CarResponse toResponse(Cars car) {
        return new CarResponse(
                car.getIdcar(),
                car.getMake(),
                car.getModel(),
                car.getColor(),
                car.isIsmain(),
                car.getFklogin()
        );
    }
}
