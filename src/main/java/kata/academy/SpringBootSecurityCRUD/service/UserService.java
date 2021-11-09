package kata.academy.SpringBootSecurityCRUD.service;

import kata.academy.SpringBootSecurityCRUD.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService extends UserDetailsService {
    void addUser(User user);
    List<User> getAllUsers();
    User getUserById(Long id);
    User getUserByUsername(String username);
    void updateUser(User user);
    void deleteUserById(Long id);
}
