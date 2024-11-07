package ie.atu.taskmanagementcli.User;

import jakarta.validation.constraints.Email;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "users")
public class User {

    @Id
    String id;

    @Email(message="Email must be valid with @ included")
    String userEmail;

    String password;

}
