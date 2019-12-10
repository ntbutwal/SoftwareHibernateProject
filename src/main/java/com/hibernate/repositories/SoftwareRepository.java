package com.hibernate.repositories;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hibernate.entities.SoftwareEntity;
import com.hibernate.entities.WebPageDesignEntity;
@Repository
public class SoftwareRepository {
	
	@Autowired
	private SessionFactory sessionfactory;
	
	public void saveInDatabase(SoftwareEntity software) {
		Session session= sessionfactory.openSession();
		session.beginTransaction();
		session.persist(software);
		session.getTransaction().commit();
		session.close();
	}
	
	public void saveInWebDatabase(WebPageDesignEntity wpde) {
		Session session= sessionfactory.openSession();
		session.beginTransaction();
		session.persist(wpde);
		session.getTransaction().commit();
		session.close();
	}

	public SessionFactory getSessionfactory() {
		return sessionfactory;
	}

	public void setSessionfactory(SessionFactory sessionfactory) {
		this.sessionfactory = sessionfactory;
	}
	

}
