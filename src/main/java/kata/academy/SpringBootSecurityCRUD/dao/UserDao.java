package kata.academy.SpringBootSecurityCRUD.dao;

import kata.academy.SpringBootSecurityCRUD.model.User;

import java.util.List;

public interface UserDao {
    void saveUser(User user);
    List<User> getAllUsers();
    User getUserById(Long id);
    User getUserByName(String name);
    void updateUser(User user);
    void deleteUserById(Long id);
}