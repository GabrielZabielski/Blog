package blog.example.blog.service;

import blog.example.blog.Model.PostsEntity;
import blog.example.blog.repository.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;
@Service
public class PostsService implements PostServiceInterface{

    @Qualifier("postRepo")
    @Autowired
    private PostRepo postRepo;

    @Override
    public String addNewPost(String title, String content){
            PostsEntity post = new PostsEntity();
            post.setContent(Converter.convert(content));
            post.setTitle(Converter.convert(title));
            postRepo.save(post);
            return "saved";
    }

    @Override
    public Iterable<PostsEntity> getAllPosts() {
        return postRepo.findAll();
    }

    @Override
    public Optional<PostsEntity> getPostById(long id) {
        return postRepo.findById(id);
    }

    @Override
    public String deletePostById(long id ) {
        postRepo.deleteById(id);
        return "Post number "+id+" has been deleted.";
    }
}