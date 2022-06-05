package uz.tuit.census.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.tuit.census.entity.AuthUser;

import java.util.Optional;

public interface AuthUserRepository extends JpaRepository<AuthUser, Long> {

    Optional<Long> findIdByUsername(String username);
}
