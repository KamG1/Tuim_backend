package back.demo.gasstations;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class GasStationResponse {

    private Long id_gas_station;
    private String gasStationName;
    private Double firstCo;
    private Double secondCo;
    private Double costOn;
    private Double costBenz;
    private Double costLpg;

}
