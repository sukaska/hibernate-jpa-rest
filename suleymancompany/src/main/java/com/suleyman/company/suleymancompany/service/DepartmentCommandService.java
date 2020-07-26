package com.suleyman.company.suleymancompany.service;

import com.suleyman.company.suleymancompany.dto.CreateDepartmentDTO;

public interface DepartmentCommandService {
    Long saveDepartment(CreateDepartmentDTO dto);
}
