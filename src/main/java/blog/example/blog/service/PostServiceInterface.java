package blog.example.blog.service;

import blog.example.blog.Model.PostsEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

//@Service
public interface PostServiceInterface {

    public String                addNewPost(String title, String content);
    public Iterable<PostsEntity> getAllPosts();
    public Optional<PostsEntity> getPostById(long id);
    public String                deletePostById(long id);
}
