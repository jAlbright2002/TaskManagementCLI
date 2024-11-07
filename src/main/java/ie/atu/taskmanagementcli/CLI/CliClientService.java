package ie.atu.taskmanagementcli.CLI;

import org.springframework.stereotype.Service;

@Service
public class CliClientService {

    public void welcomeMessage() {
        System.out.println("******************************");
        System.out.println("** Personal Task Management **");
        System.out.println("******************************\n");
    }

}
