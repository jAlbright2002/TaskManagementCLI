package ie.atu.taskmanagementcli.Login;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    private LoginService service;

    public LoginController(LoginService service) {
        this.service = service;
    }


}
