package org.tnsif.birectionaldemo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class OnetoManyBirectional {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		
		em.getTransaction().begin();
		
		//person1
		Person p=new Person();
		p.setAdharno(44446498);
		p.setName("Narendra Modi");
	

		//person2
		Person p1=new Person();
		p1.setAdharno(791469461);
		p1.setName("Amit Shah");
		
		//contact1
		Contact c1=new Contact();
		c1.setContactno(5464648845L);
		c1.setSimtype("Prepaid");
		
		//contact-2
		Contact c2=new Contact();
		c2.setContactno(7946946459L);
		c2.setSimtype("Postpaid");
		
		p.setContact(c2);
		p1.setContact(c1);
		
		em.persist(p);
		em.persist(p1);
		em.getTransaction().commit();

		System.out.println("Data added successfully");
		em.close();

		factory.close();
	}

}