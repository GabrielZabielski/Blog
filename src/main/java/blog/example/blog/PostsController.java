package blog.example.blog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/home")
public class PostsController {

    @Autowired      //Make PostRepo Interface
    private PostRepo postRepo;

    @GetMapping("/add")
    public @ResponseBody String addNewPost(@RequestParam String title, @RequestParam String content){
        // @ResponseBody - return

        PostsEntity post = new PostsEntity();
        post.setContent(content);
        post.setTitle(title);
        postRepo.save(post);
        return "saved";
    }

    @GetMapping("/all")
    public @ResponseBody Iterable<PostsEntity> getAllPosts(){
        return postRepo.findAll();
    }

}
