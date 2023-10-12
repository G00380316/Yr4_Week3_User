package ie.atu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final EmailService emailService;

    @Autowired
    public UserService(EmailService emailService) {
        this.emailService = emailService;
    }

    public void registerUser(String username, String email) {
        //some user registration logic
        if (username.length() < 3) {
            return;
        } else if (!email.contains("@")) {
            return;
        } else {
            //Send confirmation email
            getEmail(email);
        }
    }
    
    public String getEmail(String email) {
        return emailService.sendEmail(email, "Welcome to our platform!");
    }
}