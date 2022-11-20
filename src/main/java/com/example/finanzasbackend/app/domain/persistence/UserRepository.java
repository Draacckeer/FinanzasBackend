package com.example.finanzasbackend.app.domain.persistence;

import com.example.finanzasbackend.app.domain.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    List<User> findByUsernameAndPassword(String username, String password);
}
