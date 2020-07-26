package com.suleyman.company.suleymancompany.service.impl;

import com.suleyman.company.suleymancompany.converter.DepartmentConverter;
import com.suleyman.company.suleymancompany.domain.Company;
import com.suleyman.company.suleymancompany.domain.Department;
import com.suleyman.company.suleymancompany.domain.Employee;
import com.suleyman.company.suleymancompany.dto.CreateDepartmentDTO;
import com.suleyman.company.suleymancompany.repository.CompanyRepository;
import com.suleyman.company.suleymancompany.repository.DepartmentRepository;
import com.suleyman.company.suleymancompany.repository.EmployeeRepository;
import com.suleyman.company.suleymancompany.service.DepartmentCommandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@Transactional
public class DepartmentCommandServiceImpl implements DepartmentCommandService {
    private final DepartmentRepository departmentRepository;
    private final CompanyRepository companyRepository;
    private final EmployeeRepository employeeRepository;

    @Autowired
    public DepartmentCommandServiceImpl(DepartmentRepository departmentRepository, CompanyRepository companyRepository, EmployeeRepository employeeRepository) {
        this.departmentRepository = departmentRepository;
        this.companyRepository = companyRepository;
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Long saveDepartment(CreateDepartmentDTO dto)

    {
        Department department = DepartmentConverter.converter.dtoEntity(dto);
        Optional<Company> optionalCompany = companyRepository.findById(dto.getCompanyId());
        Company company  = optionalCompany.get();
        department.setCompany(company);
        if (dto.getManagerId() != null){
            Optional<Employee> optionalManager = employeeRepository.findById(dto.getManagerId());
            Employee manager = optionalManager.get();
            department.setManager(manager);
        }
        Department savedDepartment = departmentRepository.save(department);
        return savedDepartment.getId();
    }
}
