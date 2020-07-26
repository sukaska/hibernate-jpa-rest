package com.suleyman.company.suleymancompany.service.impl;

import com.suleyman.company.suleymancompany.converter.CompanyConverter;
import com.suleyman.company.suleymancompany.domain.Company;
import com.suleyman.company.suleymancompany.dto.CreateCompanyDTO;
import com.suleyman.company.suleymancompany.repository.CompanyRepository;
import com.suleyman.company.suleymancompany.service.CompanyCommandService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class CompanyCommandServiceImpl implements CompanyCommandService {
    private final CompanyRepository companyRepository;

    public CompanyCommandServiceImpl(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }


    @Override
    public Long saveCompany(CreateCompanyDTO dto) {
        Company company = CompanyConverter.converter.dtoEntity(dto);
        Company savedCompany = companyRepository.save(company);
        return savedCompany.getId();
    }

}
