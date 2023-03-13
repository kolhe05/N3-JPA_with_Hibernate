package org.tnsif.unidirectional;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
//Program to demonstrate example on one to one association
@Entity
@Table(name="AddressTwo")
public class AddressTwo implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private Integer pincode;
	private String area;
	private String city;
	private String state;
	public Integer getPincode() {
		return pincode;
	}
	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	
	public AddressTwo() {
		super();
		
	}
	
	
	public AddressTwo(Integer pincode, String area, String city, String state) {
		super();
		this.pincode = pincode;
		this.area = area;
		this.city = city;
		this.state = state;
	}
	@Override
	public String toString() {
		return "AddressTwo [pincode=" + pincode + ", area=" + area + ", city=" + city + ", state=" + state + "]";
	}
	
	

}