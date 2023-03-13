package org.tnsif.unidirectional;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

//Program to demonstrate example on one to one association
@Entity
@Table(name="EmployeeTwo")
public class EmployeeTwo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer empid;
	private String empname;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="Pincode")
	private AddressTwo address;
	
//Getters and setters
	public Integer getEmpid() {
		return empid;
	}
	public void setEmpid(Integer empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public AddressTwo getAddress() {
		return address;
	}
	public void setAddress(AddressTwo address) {
		this.address = address;
	}
	//Default constructor 
	public EmployeeTwo() {
		super();
		
	}
	//Parameterized constructor
	public EmployeeTwo(Integer empid, String empname, AddressTwo address) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.address = address;
	}
	@Override
	public String toString() {
		return "EmployeeTwo [empid=" + empid + ", empname=" + empname + ", address=" + address + "]";
	}
	
	
	
	

}