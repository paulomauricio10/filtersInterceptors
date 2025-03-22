package com.filterinterceptors.controller;

import com.filterinterceptors.dto.EmployeeRecord;
import com.filterinterceptors.model.EmployeeModel;
import com.filterinterceptors.services.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService userService) {
        this.employeeService = userService;
    }

    @GetMapping
    public ResponseEntity<List<EmployeeModel>> getAllEmployees() {
        return ResponseEntity.ok(employeeService.getAllEmployees());
    }

    @GetMapping("/{id}")
    public ResponseEntity<EmployeeModel> getEmployeeById(@PathVariable Integer id) {
        Optional<EmployeeModel> employee = employeeService.getEmployeeById(id);
        if (employee.isPresent()) {
            return ResponseEntity.ok(employee.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<EmployeeModel> createEmployee(@Valid @RequestBody EmployeeRecord employeeRecord) {
        EmployeeModel employee = convertToEmployeeModel(employeeRecord);
        EmployeeModel createdEmployee = employeeService.createEmployee(employee);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdEmployee);
    }

    @PutMapping("/{id}")
    public ResponseEntity<EmployeeModel> updateEmployee(@PathVariable Integer id, @Valid @RequestBody EmployeeRecord employeeRecord) {
        EmployeeModel employee = convertToEmployeeModel(employeeRecord);
        try {
            EmployeeModel updatedEmployee = employeeService.updateEmployee(id, employee);
            return ResponseEntity.ok(updatedEmployee);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEmployee(@PathVariable Integer id) {
        employeeService.deleteEmployee(id);
        return ResponseEntity.noContent().build();
    }

    private EmployeeModel convertToEmployeeModel(EmployeeRecord employeeRecord) {
        EmployeeModel employee = new EmployeeModel();
        employee.setEmpNo(employeeRecord.empNo());
        employee.setBirthDate(employeeRecord.birthDate());
        employee.setFirstName(employeeRecord.firstName());
        employee.setLastName(employeeRecord.lastName());
        //employee.setGender(employeeRecord.gender());
        employee.setHireDate(employeeRecord.hireDate());
        return employee;
    }
}
