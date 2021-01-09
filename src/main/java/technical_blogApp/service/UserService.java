package technical_blogApp.service;

import org.springframework.stereotype.Service;
import technical_blogApp.model.User;

/***
 *
 *@Project technicalblog
 *@author Himandri on 1/10/2021
 *
 */
@Service
public class UserService {
    public boolean login(User user) {
        if(user.getUsername().equals("validuser")) {
            return true;
        }
        else {
            return false;
        }
    }
}
