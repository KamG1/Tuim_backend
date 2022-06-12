package back.demo.requestMappers;

import back.demo.classes.Gasstation;
import back.demo.requests.GasStationRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class RequestToGasStationMapper {

    public Gasstation mapToGasStation(GasStationRequest request) {
        Gasstation gasstation = new Gasstation();
        gasstation.setIdGasStation(request.getId_gas_station());
        gasstation.setGasStationName(request.getGasStationName());
        gasstation.setFirstCo(request.getFirstCo());
        gasstation.setSecondCo(request.getSecondCo());
        gasstation.setCostOn(request.getCostOn());
        gasstation.setCostBenz(request.getCostBenz());
        gasstation.setCostLpg(request.getCostLpg());
        return gasstation;
    }
}
