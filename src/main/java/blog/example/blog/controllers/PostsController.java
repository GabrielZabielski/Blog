package blog.example.blog.controllers;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.*;


@Controller
public class PostsController {

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String home(){
        return "index";
    }

}
