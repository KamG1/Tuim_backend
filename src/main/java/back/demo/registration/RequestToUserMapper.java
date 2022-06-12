package back.demo.registration;

import back.demo.classes.User;
import back.demo.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;


@Component
@RequiredArgsConstructor
public class RequestToUserMapper {

    private final UserService userService;

    public User mapToUser(RegistrationRequest request, String encryptedPassword) {
        User user = new User();
        user.setLogin(request.getLogin());
        user.setPassword(encryptedPassword);
        user.setEmail(request.getEmail());
        user.setPhoneNumber(request.getPhone_number());
        user.setPoints(request.getPoints());
        return user;
    }
}
