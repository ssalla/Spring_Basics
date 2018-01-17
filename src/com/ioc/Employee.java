package com.ioc;

public class Employee {
	private int eid;
	private String ename;
	private String salary;
	private Dept dpt;
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public Dept getDpt() {
		return dpt;
	}
	public void setDpt(Dept dpt) {
		this.dpt = dpt;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + ", dpt=" + dpt + "]";
	}
	
	

}
