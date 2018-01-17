package com.ioc;

import java.util.Date;

public class Dept {
	private int dptno;
	private String dname;
	private Date dt;
	
	public Dept(int dptno, String dname, Date dt) {
		super();
		this.dptno = dptno;
		this.dname = dname;
		this.dt = dt;
	}

	@Override
	public String toString() {
		return "Dept [dptno=" + dptno + ", dname=" + dname + ", dt=" + dt + "]";
	}
	
	
	

}
