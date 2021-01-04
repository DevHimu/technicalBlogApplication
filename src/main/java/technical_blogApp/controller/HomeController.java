package technical_blogApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/***
 *
 *@Project technicalblog
 *@author Himandri on 1/4/2021
 *
 */
@Controller
public class HomeController {
    @RequestMapping
    public String getAllPosts()
    {
        return "index";
    }
}
