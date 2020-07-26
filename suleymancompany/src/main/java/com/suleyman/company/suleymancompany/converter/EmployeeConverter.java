package com.suleyman.company.suleymancompany.converter;

import com.suleyman.company.suleymancompany.domain.Employee;
import com.suleyman.company.suleymancompany.dto.CreateEmployeeDTO;

public class EmployeeConverter {
    public static EmployeeConverter converter = new EmployeeConverter();

    private EmployeeConverter(){};

    public Employee dtoToEntity(CreateEmployeeDTO createEmployeeDTO){
        Employee employee = new Employee();
        employee.setName(createEmployeeDTO.getName());
        employee.setSurname(createEmployeeDTO.getSurname());
        employee.setSalary(createEmployeeDTO.getSalary());
        employee.setEntryDate(createEmployeeDTO.getEntryDate());
        employee.setIdentityNumber(createEmployeeDTO.getIdentityNumber());
        return employee;
    }


}
