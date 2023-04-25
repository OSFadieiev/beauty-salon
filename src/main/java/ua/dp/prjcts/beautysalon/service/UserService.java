package ua.dp.prjcts.beautysalon.service;

import ua.dp.prjcts.beautysalon.model.User;

import java.util.List;

public interface UserService {
    User create(User user);
    List<User> getAll();
}
