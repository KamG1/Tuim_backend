package back.demo.classes;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
public class Tankrecords {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTankRecords;
    private Date date;
    private Double millage;
    private Double liters;
    private Double costInPln;

    @JoinColumn(name = "fkauto")
    private Integer fkauto;
}
