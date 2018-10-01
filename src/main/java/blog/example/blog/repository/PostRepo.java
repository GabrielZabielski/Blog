package blog.example.blog.repository;
import blog.example.blog.Model.PostsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("postRepo")
public interface PostRepo extends JpaRepository<PostsEntity, Long> {

}
