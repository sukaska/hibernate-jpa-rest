package com.suleyman.company.suleymancompany.controller;

import com.suleyman.company.suleymancompany.dto.CreateCompanyDTO;
import com.suleyman.company.suleymancompany.request.CreateCompanyRequest;
import com.suleyman.company.suleymancompany.service.CompanyCommandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
//Json veri alıp veri json veri işliyor
@RequestMapping(value = "company/api", consumes = {MediaType.APPLICATION_JSON_VALUE},
        produces = {MediaType.APPLICATION_JSON_VALUE})
public class CompanyApiController {

     private final CompanyCommandService companyCommandService;

    @Autowired
    public CompanyApiController(CompanyCommandService companyCommandService) {
        this.companyCommandService = companyCommandService;
    }
    @PostMapping(value = "/company")
    public Long createCompany(@RequestBody @Valid CreateCompanyRequest createCompanyRequest){
        Long companyId = companyCommandService.saveCompany(createCompanyRequest.getCreateCompanyDTO());
                return companyId;
    }
}
