package com.demo.service;

import com.demo.dto.UserDto;
import com.demo.entity.User;
import com.demo.model.Session;
import com.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;

import static com.demo.model.Session.LOGGED_IN;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public UserDto login(String login, String password) {
        User user = userRepository.findByLoginAndPassword(login, password);
        return user == null ? null : new UserDto(user.getFirstName(), user.getLogin());
    }

    @Transactional
    public UserDto register(String firstName, String login, String password) {
        if (userRepository.countByLogin(login) > 0) {
            return null;
        } else {
            userRepository.save(new User(firstName, login, password));
            return new UserDto(firstName, login);
        }
    }

    public Boolean isLoggedIn(Model model) {
        return model.containsAttribute(LOGGED_IN) && (Boolean) model.asMap().get(LOGGED_IN);
    }
}
