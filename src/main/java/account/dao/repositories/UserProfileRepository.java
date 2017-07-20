package account.dao.repositories;

import account.dao.models.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Repository;

/**
 * Created by anastasia on 20.07.17.
 */

@Repository
public interface UserProfileRepository extends JpaRepository<UserProfile, Long> {

    @Query("SELECT user from UserProfile user where user.email = :#{#username}")
    UserProfile findByUsername(String username);
}
