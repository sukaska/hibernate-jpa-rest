package com.suleyman.company.suleymancompany.repository;

import com.suleyman.company.suleymancompany.domain.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company,Long> {
}
