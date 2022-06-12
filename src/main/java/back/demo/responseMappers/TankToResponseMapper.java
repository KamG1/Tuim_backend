package back.demo.responseMappers;

import back.demo.classes.Tankrecords;
import back.demo.responses.TankResponse;
import org.springframework.stereotype.Component;

@Component
public class TankToResponseMapper {

    public TankResponse toResponse(Tankrecords tank) {
        return new TankResponse(
                tank.getIdTankRecords(),
                tank.getDate(),
                tank.getMillage(),
                tank.getLiters(),
                tank.getCostInPln(),
                tank.getFkauto()
        );
    }
}
