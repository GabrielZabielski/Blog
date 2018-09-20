package blog.example.blog;
import org.springframework.data.repository.CrudRepository;

public interface PostRepo extends CrudRepository<PostsEntity, Long>{

}
