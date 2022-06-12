package back.demo.controllers;


import back.demo.responses.UserResponse;
import back.demo.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.GeneralSecurityException;


@RestController
@RequiredArgsConstructor
@RequestMapping("/getUserByLogin/{login}&{password}")
public class UserController {

    private final UserService userService;

    @GetMapping
    public UserResponse getUserByLogin(@PathVariable("login") String login, @PathVariable("password") String password) throws GeneralSecurityException {
        return userService.getUser(login, password);
    }

}
