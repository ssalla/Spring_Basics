package com.ioc;

import java.util.Arrays;
import java.util.List;

public class Student {
	private int[] marks;
	private List names;
	
	public int[] getMarks() {
		return marks;
	}
	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	public List getNames() {
		return names;
	}
	public void setNames(List names) {
		this.names = names;
	}
	@Override
	public String toString() {
		return "Student [marks=" + Arrays.toString(marks) + ", names=" + names + "]";
	}
	
	

}
