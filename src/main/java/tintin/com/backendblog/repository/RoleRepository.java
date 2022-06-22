package tintin.com.backendblog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tintin.com.backendblog.constant.enums.ERole;
import tintin.com.backendblog.entity.Role;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole role);
}
