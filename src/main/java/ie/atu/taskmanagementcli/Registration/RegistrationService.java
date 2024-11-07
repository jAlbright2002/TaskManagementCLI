package ie.atu.taskmanagementcli.Registration;

import ie.atu.taskmanagementcli.User.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {

    private UserRepository repo;

    @Autowired
    public RegistrationService(UserRepository repo) {
        this.repo = repo;
    }

    //create


}
