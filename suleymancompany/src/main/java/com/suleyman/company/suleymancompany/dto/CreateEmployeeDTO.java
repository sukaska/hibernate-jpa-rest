package com.suleyman.company.suleymancompany.dto;

import com.sun.istack.NotNull;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;
import java.time.LocalDate;

public class CreateEmployeeDTO {
    @NotBlank(message = "isim boş bırakılamaz")
    private String name;
    @NotBlank(message = "isim boş bırakılamaz")
    private String surname;
    @DecimalMin(value="2300.0",message = "işçiyi sömürme şerefffffffff......z")
    private BigDecimal salary;
    @NotNull
    private LocalDate entryDate;
    @NotNull
    @Digits(integer = 11, fraction = 0 , message ="Kimlik numarası 11 haneli olmalıdır")
    private Long identityNumber;

    @NotNull
    private Long departmentId;


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

    public Long getIdentityNumber() {
        return identityNumber;
    }

    public void setIdentityNumber(Long identityNumber) {
        this.identityNumber = identityNumber;
    }

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }
}
