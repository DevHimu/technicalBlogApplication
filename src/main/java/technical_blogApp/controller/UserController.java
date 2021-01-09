package technical_blogApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import technical_blogApp.model.Post;
import technical_blogApp.model.User;
import technical_blogApp.service.PostService;
import technical_blogApp.service.UserService;

import java.util.ArrayList;

/***
 *
 *@Project technicalblog
 *@author Himandri on 1/6/2021
 *
 */
@Controller
public class UserController {
    @Autowired
    private PostService postService;
    @Autowired
    private UserService userService;
    @RequestMapping("users/login")
    public String login() {
        return "users/login";
    }

    @RequestMapping("users/registration")
    public String registration() {
        return "users/registration";
    }

    @RequestMapping(value = "users/login", method= RequestMethod.POST)
    public String loginUser(User user) {
        if(userService.login(user)) {
            return "redirect:/posts";
        }
        else {
            return "users/login";
        }
    }

    @RequestMapping(value = "users/logout", method= RequestMethod.POST)
    public String logOut(Model model)
    {
        ArrayList<Post>posts = postService.getAllPost();
        model.addAttribute("posts",posts);
        return  "index";
    }
    @RequestMapping(value = "users/registration", method=RequestMethod.POST)
    public String registerUser(User user) {
        return "users/login";
    }
}
