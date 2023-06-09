package ua.dp.prjcts.beautysalon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.dp.prjcts.beautysalon.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
