package in.uk.entity;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
	@Id
	private Integer empId;
	private String empName;
	private String dpt;
	private String loc;
	private Long mobNo;
	public Employee(Integer empId, String empName, String dpt, String loc, Long mobNo) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.dpt = dpt;
		this.loc = loc;
		this.mobNo = mobNo;
	}
	
	public Employee() {}

	
	
	@Override
	public int hashCode() {
		return Objects.hash(dpt, empId, empName, loc, mobNo);
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
		return Objects.equals(dpt, other.dpt) && Objects.equals(empId, other.empId)
				&& Objects.equals(empName, other.empName) && Objects.equals(loc, other.loc)
				&& Objects.equals(mobNo, other.mobNo);
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", dpt=" + dpt + ", loc=" + loc + ", mobNo="
				+ mobNo + "]";
	}
	
	
}
