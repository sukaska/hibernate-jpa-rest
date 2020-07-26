package com.suleyman.company.suleymancompany.service;

import com.suleyman.company.suleymancompany.dto.CreateCompanyDTO;

public interface CompanyCommandService {
    Long saveCompany(CreateCompanyDTO dto);
}
