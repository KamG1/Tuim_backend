package back.demo.gasstations;


import lombok.Data;

@Data
public class GasStationRequest {
    private Long id_gas_station;
    private String gasStationName;
    private Double firstCo;
    private Double secondCo;
    private Double costOn;
    private Double costBenz;
    private Double costLpg;
}
