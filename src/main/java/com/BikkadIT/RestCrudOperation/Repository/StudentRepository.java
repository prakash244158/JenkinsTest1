package com.BikkadIT.RestCrudOperation.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BikkadIT.RestCrudOperation.Entities.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {

}
