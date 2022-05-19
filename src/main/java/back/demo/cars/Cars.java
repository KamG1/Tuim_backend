package back.demo.cars;

import back.demo.tanks.Tankrecords;
import back.demo.user.User;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Cars {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idcar;
    private String make;
    private String model;
    private String color;
    private boolean ismain;

    @JoinColumn(name = "fklogin")
    private String fklogin;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "fkauto")
    private List<Tankrecords> tankrecords;

}

