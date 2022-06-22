package tintin.com.backendblog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tintin.com.backendblog.entity.Todo;

import javax.transaction.Transactional;
import java.util.List;

public interface TodoRepository extends JpaRepository<Todo, Long> {
    List<Todo> findByUserId(Long userId);

    @Transactional
    void deleteByTodoId(long todoId);
}
