package com.suleyman.company.suleymancompany.service.impl;

import com.suleyman.company.suleymancompany.converter.EmployeeConverter;
import com.suleyman.company.suleymancompany.domain.Department;
import com.suleyman.company.suleymancompany.domain.Employee;
import com.suleyman.company.suleymancompany.dto.CreateEmployeeDTO;
import com.suleyman.company.suleymancompany.repository.DepartmentRepository;
import com.suleyman.company.suleymancompany.repository.EmployeeRepository;
import com.suleyman.company.suleymancompany.service.EmployeeCommandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@Transactional
public class EmployeeCommandServiceImpl implements EmployeeCommandService {
    private final EmployeeRepository employeeRepository;
    private final DepartmentRepository departmentRepository;

    @Autowired
    public EmployeeCommandServiceImpl(EmployeeRepository employeeRepository, DepartmentRepository departmentRepository) {
        this.employeeRepository = employeeRepository;
        this.departmentRepository = departmentRepository;
    }

    @Override
    public Long saveEmployee(CreateEmployeeDTO dto) {
        Employee employee = EmployeeConverter.converter.dtoToEntity(dto);
        Optional <Department> optionalDepartment = departmentRepository.findById(dto.getDepartmentId());
        Department department = optionalDepartment.get();
        employee.setDepartment(department);
        Employee savedEmployee = employeeRepository.save(employee);
        return savedEmployee.getId();
    }
}
