package ie.atu.taskmanagementcli.CLI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
public class CliClientInterface {

    private CliClientService service;

    @Autowired
    public CliClientInterface(CliClientService service) {
        this.service = service;
    }

    //intro
    @ShellMethod(value = "User Guide", key = "guide")
    public void userGuide() {
        service.welcomeMessage();
    }

    //offer choice between registration and login

    //if registration
    //do this

    //else
    //go to login

    //back here after login/registration
    //print welcome or something

}
