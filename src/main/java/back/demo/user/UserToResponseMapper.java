package back.demo.user;

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
