package com.suleyman.company.suleymancompany.request;


import com.suleyman.company.suleymancompany.dto.CreateCompanyDTO;

public class CreateCompanyRequest {
    private CreateCompanyDTO createCompanyDTO;

    public CreateCompanyDTO getCreateCompanyDTO(){

        return createCompanyDTO;
    }

    public void setCreateCompanyDTO(CreateCompanyDTO createCompanyDTO)
    {
        this.createCompanyDTO = createCompanyDTO;
    }
    }
