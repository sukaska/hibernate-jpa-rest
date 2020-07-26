package com.suleyman.company.suleymancompany.domain;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name="department")
public class Department extends BaseEntity {
    @Column(unique = true)
    @NotBlank(message = "departman ismi giriniz")
    private String name;
    @Column
    @NotBlank
    private String location;
    @OneToOne(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "manager_id")
    private Employee manager;

    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;

    public Company getCompany(Long companyId) {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Employee getManager(Long managerId) {
        return manager;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }
}
