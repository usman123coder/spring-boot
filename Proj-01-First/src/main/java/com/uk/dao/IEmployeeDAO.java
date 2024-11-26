package com.uk.dao;

import java.util.List;

public interface IEmployeeDAO {
	public List<Employee> getEmpsByDesg
		(String desg1, String desg2, String desg3)throws Exception; 

}
