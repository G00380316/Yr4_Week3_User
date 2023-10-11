package ie.atu;

import org.springframework.stereotype.Service;

@Service
public class EmailService {
    public String sendEmail(String to, String message) {
        //Code to send an email
        return to + "\n\n\r" + message;
    }
}
