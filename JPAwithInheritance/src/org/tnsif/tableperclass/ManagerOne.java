package org.tnsif.tableperclass;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="ManagerOne")
public class ManagerOne extends EmployeeOne {
	
	private int deptId;
	private String deptName;
	
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	@Override
	public String toString() {
		return "Manager [deptId=" + deptId + ", deptName=" + deptName + "]";
	}
	
	

}