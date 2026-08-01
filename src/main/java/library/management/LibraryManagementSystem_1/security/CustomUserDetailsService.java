package library.management.LibraryManagementSystem_1.security;



//import com.library.entity.User;
//import com.library.exception.UserNotFoundException;
//import com.library.repository.UserRepository;
import library.management.LibraryManagementSystem_1.entity.User;
import library.management.LibraryManagementSystem_1.exception.UserNotFoundException;
import library.management.LibraryManagementSystem_1.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomUserDetailsService implements UserDetailsService {

    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) {

        User user = userRepository.findByUsername(username)
                .orElseThrow(() ->
                        new UserNotFoundException("User not found"));

        return new CustomUserDetails(user);
    }
}