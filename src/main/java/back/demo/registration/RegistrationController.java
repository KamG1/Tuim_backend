package back.demo.registration;

import back.demo.gasstations.GasStationRequest;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.security.GeneralSecurityException;

@RestController
@RequestMapping
@AllArgsConstructor
public class RegistrationController {
    private RegistrationService registrationService;

    @PostMapping("/addUser")
    public void register(@RequestBody RegistrationRequest request) throws GeneralSecurityException {
        registrationService.register(request);
    }

    @PutMapping("/addPoints/")
    public void alterUser(@RequestBody RegistrationRequest request) {
        registrationService.addPoints(request);
    }
}
