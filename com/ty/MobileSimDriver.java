package com.ty;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MobileSimDriver {
	public static void main(String[] args) {
		Mobile mobile=new Mobile();
	//	mobile.setId(1);
		mobile.setName("vivo");
		mobile.setCost(100);
		
		Sim sim1=new Sim();
		sim1.setName("airtel");
		sim1.setProvider("airtel");
		
		Sim sim2=new Sim();
		sim2.setName("jio");
		sim2.setProvider("relience");
		
		List<Sim> sims=new ArrayList();
		sims.add(sim1);
		sims.add(sim2);
		
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
