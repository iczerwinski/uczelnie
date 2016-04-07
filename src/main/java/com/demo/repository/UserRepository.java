package com.demo.repository;

import com.demo.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

    User findByLoginAndPassword(String login, String password);

    Long countByLogin(String login);
}
