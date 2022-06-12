package back.demo.responseMappers;

import back.demo.responses.UserResponse;
import back.demo.classes.User;
import org.springframework.stereotype.Component;

@Component
public class UserToResponseMapper {
    public UserResponse toResponse(User user) {
        return new UserResponse(
                user.getLogin(),
                user.getPassword(),
                user.getPoints(),
                user.getCars()
        );
    }
}
