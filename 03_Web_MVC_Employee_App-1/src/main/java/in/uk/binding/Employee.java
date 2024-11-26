package in.uk.binding;

import java.util.Objects;

import jakarta.persistence.Id;

public class Employee {
	

	private Integer id;
	private String empName;
	private String desig;
	private String loc;
	private String email;
	private Double salary;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDesig() {
		return desig;
	}
	public void setDesig(String desig) {
		this.desig = desig;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	@Override
	public int hashCode() {
		return Objects.hash(desig, email, empName, id, loc, salary);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(desig, other.desig) && Objects.equals(email, other.email)
				&& Objects.equals(empName, other.empName) && Objects.equals(id, other.id)
				&& Objects.equals(loc, other.loc) && Objects.equals(salary, other.salary);
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", empName=" + empName + ", desig=" + desig + ", loc=" + loc + ", email=" + email
				+ ", salary=" + salary + "]";
	}
}
