package com.ty;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertMobile1Sim1 {
public static void main(String[] args) {
	Mobile1 mobile=new Mobile1();
	mobile.setName("samsung");
	mobile.setCost(97544456);
	
	Sim1 sim1=new Sim1();
	sim1.setName("airtel");
	sim1.setProvider("Airtel");
	
	Sim1 sim2=new Sim1();
	sim2.setName("jio");
	sim2.setProvider("relience");
	
	List<Sim1> sims=new ArrayList();
	sims.add(sim1);
	sims.add(sim2);
	sim1.setMobile(mobile);
	sim2.setMobile(mobile);
	mobile.setSim(sims);
	
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	entityTransaction.begin();
	entityManager.persist(mobile);
	entityManager.persist(sim1);
	entityManager.persist(sim2);
	entityTransaction.commit();	
	}
}
