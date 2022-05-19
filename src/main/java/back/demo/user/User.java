package back.demo.user;

import back.demo.cars.Cars;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@Entity
public class User {

    @Id
    private String login;
    private String password;
    private String email;
    private String phoneNumber;
    private Integer points;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "fklogin")
    private List<Cars> cars;

    public User(String login, String password, String email, String phoneNumber, Integer points, List<Cars> cars) {
        this.login = login;
        this.password = password;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.points = points;
        this.cars = cars;
    }
}
