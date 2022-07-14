package tintin.com.backendblog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tintin.com.backendblog.entity.Todo;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {
//    List<Todo> findByUserId(Long userId);
}
