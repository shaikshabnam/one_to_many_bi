package com.ty;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class GetMobileSim {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Mobile mobile = entityManager.find(Mobile.class, 2);
		if (mobile != null) {
			System.out.println("-----mobile details----");
			System.out.println("mobile id is :" + mobile.getId());
			System.out.println("mobile name is :" + mobile.getName());
			System.out.println("mobile cost is :" + mobile.getCost());

			List<Sim> sim = mobile.getSim();
			for (Sim sim1 : sim) {
				System.out.println("*************************");
				System.out.println("-----sim details-------");
				System.out.println("sim id is :" + sim1.getId());
				System.out.println("sim name is :" + sim1.getName());
				System.out.println("sim provider is :" + sim1.getProvider());
				System.out.println("_____________________________________");
			}
		}
	}
}
