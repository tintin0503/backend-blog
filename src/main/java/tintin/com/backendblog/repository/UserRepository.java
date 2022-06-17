package tintin.com.backendblog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tintin.com.backendblog.entity.User;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
