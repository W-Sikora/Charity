package pl.coderslab.charity.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pl.coderslab.charity.model.entities.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

//    @Query("select u from User u where u.email = :email")
    Optional<User> findByEmail(String email);

}
