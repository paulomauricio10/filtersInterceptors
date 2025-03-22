package com.filterinterceptors.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.sql.Date;

public record EmployeeRecord(
        @NotNull
        Integer empNo,

        @NotNull
        Date birthDate,

        @NotBlank
        @Size(max = 14)
        String firstName,

        @NotBlank
        @Size(max = 16)
        String lastName,

        @NotNull
        Gender gender,

        @NotNull
        Date hireDate) {

    public enum Gender {
        M,
        F
    }
}