package ru.javaluxurywatches.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.javaluxurywatches.model.User;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    List<User> findByLastName(String lastName);
    List<User> findByFirstName(String firstName);
    User findById(Long id);
    User findByLogin(String login);
}
