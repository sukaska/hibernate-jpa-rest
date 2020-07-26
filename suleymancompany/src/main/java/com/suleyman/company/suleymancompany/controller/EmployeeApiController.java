package com.suleyman.company.suleymancompany.controller;

import com.suleyman.company.suleymancompany.request.CreateEmployeeRequest;
import com.suleyman.company.suleymancompany.service.EmployeeCommandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
//haberleşme-restController-RequestMaping haberleşme yolu
@RestController
//Json veri alıp veri json veri işliyor
@RequestMapping(value = "company/api", consumes = {MediaType.APPLICATION_JSON_VALUE},
produces = {MediaType.APPLICATION_JSON_VALUE})
public class EmployeeApiController {

    private final EmployeeCommandService employeeCommandService;

    @Autowired
    public EmployeeApiController(EmployeeCommandService employeeCommandService) {
        this.employeeCommandService = employeeCommandService;
    }
    //PostMapping ekleme yaptığı için kullanılıyor
    //REquestBody içindekı parantezde kendisinden sonraki istekleri istek govdesi olarak kullanıyor
    //@valid önceden belirlenmiş anatasyonların bu gosterilen  yerde kllanılmasını söylüyor
    @PostMapping(value = "/employee")
    public Long createEmployee(@RequestBody @Valid CreateEmployeeRequest createEmployeeRequest){
        Long employeeId = employeeCommandService.saveEmployee(createEmployeeRequest.getCreateEmployeeDTO());
        return employeeId;
    }
}
