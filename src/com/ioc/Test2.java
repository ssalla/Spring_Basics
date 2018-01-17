package com.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
public static void main(String[] args) {
		
		ApplicationContext ap= new ClassPathXmlApplicationContext("com/ioc/AppContext2.xml");
		
		Employee e1= ap.getBean("emp", Employee.class);
		System.out.println(e1);
		Dept d1= ap.getBean("dept", Dept.class);
		System.out.println(d1);
		
		
	}

}
