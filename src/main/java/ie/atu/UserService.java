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
        //Send confirmation email
        emailService.sendEmail(email, "Welcome to our platform!");
    }
}