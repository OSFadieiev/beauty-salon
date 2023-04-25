package ua.dp.prjcts.beautysalon.service;

import ua.dp.prjcts.beautysalon.model.Role;

public interface RoleService {
    Role create(Role role);
    Role readById(long id);
}
