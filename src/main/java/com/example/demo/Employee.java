package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)	
	private int id;
    @Column(name="emp_name")
	private String empName;
    @Column(name="app_id")
    private String appId;
    @Column(name="emai_id")
	private String emailId;
    
	public Employee() {
		
	}

	public Employee(int id, String empName, String emailId, String appId) {
		super();
		this.id = id;
		this.empName = empName;
		this.emailId = emailId;
		this.appId = appId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getAppId() {
		return appId;
	}
	public void setAppId(String appId) {
		this.appId = appId;
	}
	
	
//	@Override
//	public String toString() {
//		return "Employee [id=" + id + ", empName=" + empName + ", emaiId=" + emailId + ", app_Id=" + app_id + "]";
//	}
	
}
