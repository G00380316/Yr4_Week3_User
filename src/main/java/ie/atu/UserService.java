package ie.atu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
public class UserService {
    private final EmailService emailService;

    @Autowired
    public UserService(EmailService emailService) {
        this.emailService = emailService;
    }

    public String registerUser(String username, String email) {
        //some user registration logic
        String error = "Invalid Entry, try again";
        if (username.length() < 3) {
            return error;
        } else if (!email.contains("@")) {
            return error;
        } else {
            //Send confirmation email
            return emailService.sendEmail(email, "Welcome to our platform!");
        }
    }
}