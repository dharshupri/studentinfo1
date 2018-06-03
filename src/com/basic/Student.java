package com.ksriet.ece;

public class Student {
private String firstName;
private String lastName;
private int id;
private String gender;
private String Department;
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getDepartment() {
	return Department;
}
public void setDepartment(String department) {
	Department = department;
}
//@override
public String toString() {
return firstName+","+Department+","+gender;
}
}
