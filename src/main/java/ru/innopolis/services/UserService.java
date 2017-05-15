package ru.innopolis.services;

import ru.innopolis.entity.User;

/**
 * Created by admin on 15.05.2017. 123
 */
public interface UserService {

    User getUser(String login);
}
