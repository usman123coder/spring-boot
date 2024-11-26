package in.uk.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.uk.entity.Employee;

public interface EmployeeRepository
				extends JpaRepository<Employee, Integer>{

}
