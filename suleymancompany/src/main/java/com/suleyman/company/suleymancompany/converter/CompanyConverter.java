package com.suleyman.company.suleymancompany.converter;

import com.suleyman.company.suleymancompany.domain.Company;
import com.suleyman.company.suleymancompany.dto.CreateCompanyDTO;

public class CompanyConverter {
    public static CompanyConverter converter=new CompanyConverter();

    private  CompanyConverter (){};

    public Company dtoEntity(CreateCompanyDTO createCompanyDTO){
        Company company=new Company();
        company.setCompanyName(createCompanyDTO.getCompanyName());
        return company;

    }
}

