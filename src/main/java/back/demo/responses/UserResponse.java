package back.demo.responses;


import back.demo.classes.Cars;
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
