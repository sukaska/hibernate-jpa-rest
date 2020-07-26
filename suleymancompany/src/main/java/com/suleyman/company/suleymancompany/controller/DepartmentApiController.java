package com.suleyman.company.suleymancompany.controller;

import com.suleyman.company.suleymancompany.dto.CreateDepartmentDTO;
import com.suleyman.company.suleymancompany.request.CreateDepartmentRequest;
import com.suleyman.company.suleymancompany.request.CreateEmployeeRequest;
import com.suleyman.company.suleymancompany.service.DepartmentCommandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "company/api", consumes = {MediaType.APPLICATION_JSON_VALUE},
        produces = {MediaType.APPLICATION_JSON_VALUE})
public class DepartmentApiController {
    private final DepartmentCommandService departmentCommandService;

    @Autowired
    public DepartmentApiController(DepartmentCommandService departmentCommandService) {
        this.departmentCommandService = departmentCommandService;
    }
    @PostMapping(value = "/department")
    public Long createEmployee(@RequestBody @Valid CreateDepartmentRequest createDepartmentRequest){
        Long departmentId = departmentCommandService.saveDepartment(createDepartmentRequest.getCreateDepartmentDTO());
        return departmentId;
    }
}
