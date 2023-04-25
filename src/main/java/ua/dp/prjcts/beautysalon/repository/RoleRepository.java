package ua.dp.prjcts.beautysalon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.dp.prjcts.beautysalon.model.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}
