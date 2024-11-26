package com.uk.model;

import java.util.Objects;

import lombok.Data;

@Data
public class Employee {
	private Integer empno;
	private String eName;
	private String job;
	private String salary;
	private Integer deptNo;
	public Integer getEmpno() {
		return empno;
	}
	public void setEmpno(Integer empno) {
		this.empno = empno;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public Integer getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(Integer deptNo) {
		this.deptNo = deptNo;
	}
	@Override
	public int hashCode() {
		return Objects.hash(deptNo, eName, empno, job, salary);
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
		return Objects.equals(deptNo, other.deptNo) && Objects.equals(eName, other.eName)
				&& Objects.equals(empno, other.empno) && Objects.equals(job, other.job)
				&& Objects.equals(salary, other.salary);
	}
	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", eName=" + eName + ", job=" + job + ", salary=" + salary + ", deptNo="
				+ deptNo + "]";
	}
}
