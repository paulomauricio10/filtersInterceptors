package com.filterinterceptors.repository;

import com.filterinterceptors.model.EmployeeModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.domain.Pageable;
import java.util.List;

public interface EmployeeRepository extends JpaRepository<EmployeeModel, Integer> {

    @Query("SELECT e FROM EmployeeModel e")
    List<EmployeeModel> findTop10(Pageable pageable);

}
