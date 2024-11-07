package ie.atu.taskmanagementcli.Login;

import ie.atu.taskmanagementcli.User.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    private UserRepository repo;

    @Autowired
    public LoginService(UserRepository repo) {
        this.repo = repo;
    }

    //get by id

    //verify password elsewhere

}
