package ie.atu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "account")
public class UserController {

    private UserService users;

    @Autowired
    public UserController(UserService user) {
        this.users = user;
    }

    @GetMapping("/registerUser/{name}/{email}")
    public void getNewUser() {
        
    }

}
