package com.suleyman.company.suleymancompany.request;

import com.suleyman.company.suleymancompany.dto.CreateEmployeeDTO;

public class CreateEmployeeRequest {
    private CreateEmployeeDTO createEmployeeDTO;

    public CreateEmployeeDTO getCreateEmployeeDTO() {
        return createEmployeeDTO;
    }

    public void setCreateEmployeeDTO(CreateEmployeeDTO createEmployeeDTO) {
        this.createEmployeeDTO = createEmployeeDTO;
    }
}
