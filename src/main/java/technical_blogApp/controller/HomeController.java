package technical_blogApp.controller;

import javafx.geometry.Pos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import technical_blogApp.model.Post;
import technical_blogApp.service.PostService;

import java.util.ArrayList;
import java.util.Date;

/***
 *
 *@Project technicalblog
 *@author Himandri on 1/4/2021
 *
 */
@Controller
public class HomeController {
    @Autowired
    private PostService postService;
    @RequestMapping("/")
    public String getAllPosts(Model model)
    {
        // sample commit 2
        // sample commit
        ArrayList<Post>posts = postService.getAllPost();
        model.addAttribute("posts",posts);
        return "index";
    }
}
