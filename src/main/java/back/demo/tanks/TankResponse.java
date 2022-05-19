package back.demo.tanks;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TankResponse {

    private Long id;
    private Date date;
    private Double millage;
    private Double liters;
    private Double costInPLN;
    private Integer auto;
}
