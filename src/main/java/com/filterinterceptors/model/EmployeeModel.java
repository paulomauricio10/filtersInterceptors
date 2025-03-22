package com.filterinterceptors.model;

import jakarta.persistence.*;
import java.sql.Date;
import java.io.Serializable;

@Entity
@Table(name = "employees")
public class EmployeeModel implements Serializable {

        private static final long serialVersionUID = 1L;

        @Id
        @Column(name = "emp_no")
        private Integer empNo;

        @Column(name = "birth_date", nullable = false)
        private Date birthDate;

        @Column(name = "first_name", nullable = false, length = 14)
        private String firstName;

        @Column(name = "last_name", nullable = false, length = 16)
        private String lastName;

        @Column(name = "gender", nullable = false, columnDefinition = "ENUM('M', 'F')")
        @Enumerated(EnumType.STRING)
        private Gender gender;

        @Column(name = "hire_date", nullable = false)
        private Date hireDate;

        // Constructors, getters, and setters

        public EmployeeModel() {
        }

        public Integer getEmpNo() {
            return empNo;
        }

        public void setEmpNo(Integer empNo) {
            this.empNo = empNo;
        }

        public Date getBirthDate() {
            return birthDate;
        }

        public void setBirthDate(Date birthDate) {
            this.birthDate = birthDate;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public Gender getGender() {
            return gender;
        }

        public void setGender(Gender gender) {
            this.gender = gender;
        }

        public Date getHireDate() {
            return hireDate;
        }

        public void setHireDate(Date hireDate) {
            this.hireDate = hireDate;
        }

        // Enum for Gender
        public enum Gender {
            M,
            F
        }

    @Override
    public String toString() {
        return "EmployeeModel{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", hireDate=" + hireDate +
                '}';
    }
}
