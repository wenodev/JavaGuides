package com.example.Hibernate5.MySQL.CRUD.REST.API.Tutorial.repository;

import com.example.Hibernate5.MySQL.CRUD.REST.API.Tutorial.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
