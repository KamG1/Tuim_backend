package back.demo.gasstations;


import lombok.Data;

import javax.persistence.*;


@Data
@Entity
public class Gasstation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idGasStation;
    private String gasStationName;
    private Double firstCo;
    private Double secondCo;
    private Double costOn;
    private Double costBenz;
    private Double costLpg;

}
