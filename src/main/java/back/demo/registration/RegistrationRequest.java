package back.demo.registration;

import lombok.*;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Data
public class RegistrationRequest {
    private final String login;
    private final String password;
    private final String email;
    private final String phone_number;
    private final Integer points;
}
