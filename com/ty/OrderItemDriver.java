package com.ty;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class OrderItemDriver {
	public static void main(String[] args) {
		FoodOrder foodorder = new FoodOrder();
		foodorder.setName("naagaveni");
		foodorder.setStatus("ordered");

		Item item1 = new Item();
		item1.setName("pizza");
		item1.setQuantity(2);
		item1.setCost(900);

		Item item2 = new Item();
		item2.setName("chicken burger");
		item2.setQuantity(5);
		item2.setCost(1050);

		List<Item> list = new ArrayList();
		list.add(item1);
		list.add(item2);

		foodorder.setItem(list);
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();

		entityManager.persist(foodorder);
		entityManager.persist(item1);
		entityManager.persist(item2);

		entityTransaction.commit();

	}
}
