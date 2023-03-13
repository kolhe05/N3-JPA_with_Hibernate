package org.tnif.joinedinheritance;


import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="CitizenOne")
public class CitizenOne extends StudentOne {
	
	
	private static final long serialVersionUID = 1L;
	private String citizenType;
	private Integer passportno;
	public String getCitizenType() {
		return citizenType;
	}
	public void setCitizenType(String citizenType) {
		this.citizenType = citizenType;
	}
	public Integer getPassportno() {
		return passportno;
	}
	public void setPassportno(Integer passportno) {
		this.passportno = passportno;
	}
	
	
	

}