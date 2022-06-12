package back.demo.requests;


import lombok.Data;

import java.util.Date;

@Data
public class TankRequest {
    private Long idTankRecords;
    private Date date;
    private Double millage;
    private Double liters;
    private Double costInPln;
    private Integer fkauto;
}
