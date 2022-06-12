package back.demo.responseMappers;


import back.demo.classes.Gasstation;
import back.demo.responses.GasStationResponse;
import org.springframework.stereotype.Component;

@Component
public class GasStationToResponseMapper {
    public GasStationResponse toResponse(Gasstation gasstation) {
        return new GasStationResponse(
                gasstation.getIdGasStation(),
                gasstation.getGasStationName(),
                gasstation.getFirstCo(),
                gasstation.getSecondCo(),
                gasstation.getCostOn(),
                gasstation.getCostBenz(),
                gasstation.getCostLpg()
        );
    }
}
