package com.filterinterceptors.services;

import com.filterinterceptors.model.EmployeeModel;
import com.filterinterceptors.repository.EmployeeRepository;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository userRepository) {
        this.employeeRepository = userRepository;
    }

    public List<EmployeeModel> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public Optional<EmployeeModel> getEmployeeById(Integer id) {
        return employeeRepository.findById(id);
    }

    public EmployeeModel createEmployee(EmployeeModel employee) {
        return employeeRepository.save(employee);
    }

    public List<EmployeeModel> findTop10() {
        Pageable pageable = PageRequest.of(0, 10); // Páginação: página 0 com 10 registros
        return employeeRepository.findTop10(pageable);
    }

    public EmployeeModel updateEmployee(Integer id, EmployeeModel employeeDetails) {
        EmployeeModel employee = employeeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Employee not found with id: " + id));

        employee.setBirthDate(employeeDetails.getBirthDate());
        employee.setFirstName(employeeDetails.getFirstName());
        employee.setLastName(employeeDetails.getLastName());
        employee.setGender(employeeDetails.getGender());
        employee.setHireDate(employeeDetails.getHireDate());

        return employeeRepository.save(employee);
    }

    public void deleteEmployee(Integer id) {
        employeeRepository.deleteById(id);
    }
}