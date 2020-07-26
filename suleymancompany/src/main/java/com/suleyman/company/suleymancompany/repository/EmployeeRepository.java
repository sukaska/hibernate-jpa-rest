package com.suleyman.company.suleymancompany.repository;

import com.suleyman.company.suleymancompany.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
