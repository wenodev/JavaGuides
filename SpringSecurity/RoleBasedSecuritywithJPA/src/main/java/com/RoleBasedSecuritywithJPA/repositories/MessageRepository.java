package com.RoleBasedSecuritywithJPA.repositories;

import com.RoleBasedSecuritywithJPA.entities.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, Integer> {


}
