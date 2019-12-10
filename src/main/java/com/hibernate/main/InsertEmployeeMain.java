package com.hibernate.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hibernate.entities.SoftwareEntity;
import com.hibernate.entities.WebPageDesignEntity;
import com.hibernate.repositories.SoftwareRepository;

public class InsertEmployeeMain {
	public static void main(String[] args) {
		ApplicationContext ctxt= new ClassPathXmlApplicationContext("application-context.xml");
//		SoftwareRepository software= (SoftwareRepository) ctxt.getBean("softwareRepository");
//		SoftwareEntity se= new SoftwareEntity();
//		se.setEmployeeName("Kishor Kunwar");
//		se.setPhone("7032203541");
//		se.setDeptType("Maintainance");
//		se.setLocation("Tysons Corner");
//		software.saveInDatabase(se);
		
		
		SoftwareRepository websoft= (SoftwareRepository) ctxt.getBean("webRepository");
		WebPageDesignEntity web= new WebPageDesignEntity();
		web.setEmployeeName("Jay Joshi");
		web .setDeptType("Web Page Designe");
		web.setLocation("Chantilly");
		web.setPhone("5712203541");
		websoft.saveInWebDatabase(web);
	}
	


}
