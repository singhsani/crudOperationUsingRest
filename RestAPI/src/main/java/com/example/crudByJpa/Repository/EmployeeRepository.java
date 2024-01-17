package com.example.crudByJpa.Repository;

import com.example.crudByJpa.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
    Optional<Employee> findById(Long id);
}
