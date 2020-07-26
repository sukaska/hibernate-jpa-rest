package com.suleyman.company.suleymancompany.repository;

import com.suleyman.company.suleymancompany.domain.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department,Long > {
}
