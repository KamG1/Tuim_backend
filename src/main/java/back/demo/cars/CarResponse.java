package back.demo.cars;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CarResponse {
    private Long id;
    private String make;
    private String model;
    private String colour;
    private boolean ismain;
    private String user;

}
