package org.tnif.joinedinheritance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class JoinedInheritanceDemo {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		
		em.getTransaction().begin();
		
		//first student
		StudentOne s1=new StudentOne();
		s1.setRollno(300);
		s1.setName("Manoj");
		s1.setPercentage(87.60f);
		em.persist(s1);
		
		//second student
		StudentOne s2=new StudentOne();
		s2.setRollno(301);
		s2.setName("Pratik ");
		s2.setPercentage(99.99f);
		em.persist(s2);
		
		//first citizen
		CitizenOne c1=new CitizenOne();
		c1.setRollno(500);
		c1.setName("IronMan");
		c1.setPercentage(76.56f);
		c1.setCitizenType("India");
		c1.setPassportno(1657687);
		em.persist(c1);
		em.getTransaction().commit();

		System.out.println("Data added successfully");
		em.close();

		factory.close();

	}

}