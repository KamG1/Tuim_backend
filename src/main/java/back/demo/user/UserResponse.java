package back.demo.user;


import back.demo.cars.Cars;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserResponse {
    private String login;
    private String password;
    private Integer points;
    private List<Cars> autoList;
}
