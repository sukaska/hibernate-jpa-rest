package com.suleyman.company.suleymancompany.domain;


import javax.persistence.*;
import javax.validation.constraints.NotBlank;


@Entity
@Table(name = "company")
public class Company  extends BaseEntity{
    @NotBlank(message = "Şirket Adı Giriniz")
    private String companyName;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
