package com.example.preonboarding.repository;

import com.example.preonboarding.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository {
    Optional<User> findByUsername(String username);
}
