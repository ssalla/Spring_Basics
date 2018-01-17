package com.ioc;

import java.util.Map;

public class College {
	private Map<String, String> subjects;
	private Map<?, ?> facmobile;

	public Map<String, String> getSubjects() {
		return subjects;
	}

	public void setSubjects(Map<String, String> subjects) {
		this.subjects = subjects;
	}

	public Map<?, ?> getfacmobile() {
		return facmobile;
	}

	public void setfacmobile(Map<?, ?> facmobile) {
		this.facmobile = facmobile;
	}

	@Override
	public String toString() {
		return "College [subjects=" + subjects + ", facmobile=" + facmobile + "]";
	}
	

}
