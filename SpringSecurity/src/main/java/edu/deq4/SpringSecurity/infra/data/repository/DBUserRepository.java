package edu.deq4.SpringSecurity.infra.data.repository;

import edu.deq4.SpringSecurity.domain.DBUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DBUserRepository extends JpaRepository<DBUser, Long> {
    public DBUser findByUsername(String username);
}
