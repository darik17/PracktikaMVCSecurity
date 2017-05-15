package ru.innopolis.services;

import ru.innopolis.entity.User;

/**
 * Created by admin on 15.05.2017. 123
 */
public class UserServiceImpl implements UserService {
    public User getUser(String login) {
        User user = new User();
        user.setLogin(login);
        user.setPassword("123");
        return user;
    }
}
