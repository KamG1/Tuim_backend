package back.demo.requestMappers;

import back.demo.classes.Cars;
import back.demo.requests.CarRequest;
import back.demo.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class RequestToCarMapper {

    private final UserService userService;

    public Cars mapToCar(CarRequest request) {
        Cars car = new Cars();
        car.setIdcar(request.getIdcar());
        car.setMake(request.getMake());
        car.setModel(request.getModel());
        car.setColor(request.getColor());
        car.setIsmain(request.isIsmain());
        car.setFklogin(request.getFklogin());
        return car;
    }
}
