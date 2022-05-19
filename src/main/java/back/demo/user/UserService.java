package back.demo.user;

import lombok.AllArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import javax.security.auth.login.CredentialNotFoundException;
import java.net.URLDecoder;
import java.util.NoSuchElementException;

@Service
@AllArgsConstructor

public class UserService {

    private final static String USER_NOT_FOUND = "User %s not found";
    private final UserRepository userRepository;
    private final UserToResponseMapper userToResponseMapper;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    public UserResponse getUser(String login, String password) throws NoSuchElementException, CredentialNotFoundException {

        login = URLDecoder.decode(login);
        password = URLDecoder.decode(password);
        String finalPassword = password;
        System.out.println("finalPassword " + finalPassword);
        String finalLogin = login;
        System.out.println(bCryptPasswordEncoder.encode(finalPassword));

        UserResponse userResponse = userRepository.findAll().stream().map(userToResponseMapper::toResponse).filter
                (item -> item.getLogin().equals(finalLogin))
                .findFirst().orElseThrow(() -> new NoSuchElementException(String.format(USER_NOT_FOUND, finalLogin)));

        if (bCryptPasswordEncoder.matches(finalPassword, userResponse.getPassword())) {
            System.out.println("Login:  JESTEM");
            userResponse.setPassword("..");
            return userResponse;
        } else {
            throw new CredentialNotFoundException();
        }
    }
}
