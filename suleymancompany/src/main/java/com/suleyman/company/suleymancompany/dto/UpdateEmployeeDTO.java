package com.suleyman.company.suleymancompany.dto;

import com.sun.istack.NotNull;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.time.LocalDate;

public class UpdateEmployeeDTO {
    @NotNull
    private Long id;
    @NotBlank(message = "isim boş bırakılamaz")
    private String name;
    @NotBlank(message = "isim boş bırakılamaz")
    private String surname;
    @DecimalMin(value="2300.0",message = "işçiyi sömürme şerefffffffff......z")
    private BigDecimal salary;
    @NotNull
    private LocalDate entryDate;
    private LocalDate exitDate;
    @NotNull
    @Size(min = 11,max = 11,message ="Kimlik numarası 11 haneli olmalıdır")
    private Long identityNumber;
    @NotNull
    private Long departmentId;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }
}
