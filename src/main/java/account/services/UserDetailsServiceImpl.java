package account.services;

import account.dao.models.UserProfile;
import account.dao.repositories.UserProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Arrays;

/**
 * Created by anastasia on 20.07.17.
 */

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserProfileRepository userProfileRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserProfile activeUserProfile = userProfileRepository.findByUsername(username);
        GrantedAuthority authority = new SimpleGrantedAuthority(activeUserProfile.getRole());
        UserDetails userDetails = (UserDetails) new User(activeUserProfile.getEmail(),
                activeUserProfile.getPassword_hash(), Arrays.asList(authority));
        return userDetails;
    }
}
