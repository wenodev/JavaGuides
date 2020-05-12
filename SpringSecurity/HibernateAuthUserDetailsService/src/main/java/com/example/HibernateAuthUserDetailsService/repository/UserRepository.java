package com.example.HibernateAuthUserDetailsService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.HibernateAuthUserDetailsService.model.User;


public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
