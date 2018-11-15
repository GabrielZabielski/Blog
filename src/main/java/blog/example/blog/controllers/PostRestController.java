package blog.example.blog.controllers;

import blog.example.blog.Model.PostsEntity;
import blog.example.blog.repository.PostRepo;

import blog.example.blog.service.PostServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class PostRestController {

    @Autowired
    private PostServiceInterface postService;

    @RequestMapping(path = "/add", method = RequestMethod.PUT)
    public String addNewPost(@RequestParam String title, @RequestParam String content){
        return postService.addNewPost(title, content);
    }

    @GetMapping("/all")
    public Iterable<PostsEntity> getAllPosts(){
        return postService.getAllPosts();
    }

    @GetMapping("/all/{id}")
    public Optional<PostsEntity> getPostById(@PathVariable("id") long id){
        return postService.getPostById(id);
    }

/*  @GetMapping("/delete{id}")
    public String deletePostById(@RequestParam long id){
        return postService.deletePostById(id);
    }
*/
}
