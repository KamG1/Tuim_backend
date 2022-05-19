package back.demo.registration;

import back.demo.user.User;
import back.demo.user.UserRepository;


import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.security.GeneralSecurityException;


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
