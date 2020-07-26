package com.suleyman.company.suleymancompany.service;

import com.suleyman.company.suleymancompany.dto.CreateEmployeeDTO;

public interface EmployeeCommandService {
    Long saveEmployee(CreateEmployeeDTO dto);
}
