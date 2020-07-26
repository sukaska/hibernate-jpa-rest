package com.suleyman.company.suleymancompany.converter;

import com.suleyman.company.suleymancompany.domain.Department;
import com.suleyman.company.suleymancompany.dto.CreateDepartmentDTO;


public class DepartmentConverter  {

    public static DepartmentConverter converter = new DepartmentConverter();

    private DepartmentConverter()
    {

    };

    public Department dtoEntity(CreateDepartmentDTO createDepartmentDTO)
    {
        Department department = new Department();
        department.setName(createDepartmentDTO.getName());
        department.setLocation(createDepartmentDTO.getLocation());

        return department;

    }

}
