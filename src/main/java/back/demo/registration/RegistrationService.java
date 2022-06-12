package back.demo.registration;

import back.demo.classes.User;
import back.demo.repositories.UserRepository;


import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@RequiredArgsConstructor
public class RegistrationService {

    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    private final UserRepository userRepository;
    private final RequestToUserMapper requestToUserMapper;

    public void register(RegistrationRequest request) {
        String password = request.getPassword();
        String encodedPassword = bCryptPasswordEncoder.encode(password);
        if (encodedPassword != null) {
            userRepository.save(requestToUserMapper.mapToUser(request, encodedPassword));
        }
    }

    @Transactional
    public void addPoints(RegistrationRequest userRequest) {
        User user = userRepository.findById(userRequest.getLogin()).orElseThrow();
        user.setPoints(userRequest.getPoints());
    }
}
