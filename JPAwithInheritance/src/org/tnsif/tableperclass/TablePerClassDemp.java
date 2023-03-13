package org.tnsif.tableperclass;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.tnsif.singleinheritance.Employee;
import org.tnsif.singleinheritance.Manager;

public class TablePerClassDemp {
	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		
		em.getTransaction().begin();
		
		//first emp
		EmployeeOne e1=new EmployeeOne();
		e1.setId(200);
		e1.setName("Pratik More");
		e1.setSalary(555000.50f);
		em.persist(e1);
		
		//second emp
		EmployeeOne e2=new EmployeeOne();
		e2.setId(201);
		e2.setName("Chetan Shinde");
		e2.setSalary(45000.50f);
		em.persist(e2);
		
		//first Manager
		ManagerOne m=new ManagerOne();
		m.setId(202);
		m.setName("Yash Badhan");
		m.setSalary(42000.45f);
		m.setDeptId(45);
		m.setDeptName("Information Technology");
		em.persist(m);
		em.getTransaction().commit();

		System.out.println("Data added successfully");
		em.close();

		factory.close();

		
	}

}


