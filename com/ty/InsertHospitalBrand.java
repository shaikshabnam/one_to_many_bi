package com.ty;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertHospitalBrand {
	public static void main(String[] args) {
		Hospital hospital=new Hospital();
		hospital.setName("rainbow");
		hospital.setWebsite("rainbow123@gmail");
		
		Branch branch1=new Branch();
		branch1.setLocation("gachhiboli");
		branch1.setCity("hyd");
		branch1.setPhone(123456789);
		branch1.setHospital(hospital);
		
		Branch branch2=new Branch();
		branch2.setLocation("mrpalli");
		branch2.setCity("tirupati");
		branch2.setPhone(87654326);
		branch2.setHospital(hospital);
		
		List<Branch> branches=new ArrayList();
		branches.add(branch1);
		branches.add(branch2);
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(hospital);
		entityManager.persist(branch1);
		entityManager.persist(branch2);
		entityTransaction.commit();
	}
}
