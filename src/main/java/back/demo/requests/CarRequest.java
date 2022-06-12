package back.demo.requests;

import lombok.Data;

@Data
public class CarRequest {
    private Long idcar;
    private String make;
    private String model;
    private String color;
    private boolean ismain;
    private String fklogin;
}
