package com.example.ThymeleafCRUDExampleTutorial.repository;

import com.example.ThymeleafCRUDExampleTutorial.entity.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {
}
