package com.scp.java.eleven.SpringOne;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("springone.xml");
		Laptop l1=(Laptop)context.getBean("laptopref");
	//	Vendor v1=l1.getVendor();
		System.out.println(l1);
		//System.out.println(v1);

	}

}
