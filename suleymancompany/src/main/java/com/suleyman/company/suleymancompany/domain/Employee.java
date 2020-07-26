package com.suleyman.company.suleymancompany.domain;

import com.sun.istack.NotNull;

import javax.persistence.*;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.time.LocalDate;

@Table(name = "employee")
@Entity
public class Employee extends BaseEntity {
    @Column(name = "name")
    @NotBlank(message = "isim boş bırakılamaz")
    private String name;
    @Column(name = "surname")
    @NotBlank(message = "isim boş bırakılamaz")
    private String surname;
    @DecimalMin(value="2300.0",message = "işçiyi sömürme şerefffffffff......z")
    @Column
    private BigDecimal salary;
    @Column
    @NotNull
    private LocalDate entryDate;
    @Column
    private LocalDate exitDate;
    @Column(name = "identity_number",unique = true)
    @NotNull
    @Digits(integer = 11, fraction = 0 , message ="Kimlik numarası 11 haneli olmalıdır")
    private Long identityNumber;
    @ManyToOne
    @JoinColumn(name = "department_id")
    @NotNull
    private Department department;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public LocalDate getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(LocalDate entryDate) {
        this.entryDate = entryDate;
    }

    public LocalDate getExitDate() {
        return exitDate;
    }

    public void setExitDate(LocalDate exitDate) {
        this.exitDate = exitDate;
    }

    public Long getIdentityNumber() {
        return identityNumber;
    }

    public void setIdentityNumber(Long identityNumber) {
        this.identityNumber = identityNumber;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
