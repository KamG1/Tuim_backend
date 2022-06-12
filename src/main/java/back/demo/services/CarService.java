package back.demo.services;

import back.demo.requests.CarRequest;
import back.demo.responseMappers.CarToResponseMapper;
import back.demo.requestMappers.RequestToCarMapper;
import back.demo.classes.Cars;
import back.demo.repositories.CarRepository;
import back.demo.responses.CarResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CarService {

    private final CarRepository carRepository;
    private final CarToResponseMapper carToResponseMapper;
    private final RequestToCarMapper requestToCarMapper;

    public List<CarResponse> getCars() {
        return carRepository.findAll().stream()
                .map(carToResponseMapper::toResponse)
                .collect(Collectors.toList());
    }

    public void addCar(CarRequest carRequest) {
        carRepository.save(requestToCarMapper.mapToCar(carRequest));
    }

    public void deleteCar(CarRequest carRequest) {
        Cars cars = requestToCarMapper.mapToCar(carRequest);
        carRepository.deleteById(cars.getIdcar());

    }
}
