package com.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {

	public static void main(String[] args) {
		
		ApplicationContext ap= new ClassPathXmlApplicationContext("com/ioc/AppContext1.xml");
		
		/*User one = (User) ap.getBean("user");
		System.out.println(one);
		*/
		Student st1 =  ap.getBean("St", Student.class);
		System.out.println(st1);
		
		College cg =  ap.getBean("Clg", College.class);
		System.out.println(cg);
		
		
		
	}

}
