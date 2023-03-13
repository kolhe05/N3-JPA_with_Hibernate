package org.tnsif.unidirectional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class OnetoOneUnidirectional {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		
		em.getTransaction().begin();
		//First Employee
		EmployeeTwo emp1=new EmployeeTwo();
		emp1.setEmpname("Pratik More");
		//Second Employee
		EmployeeTwo emp2=new EmployeeTwo();
		emp1.setEmpname("Amey Amle");
		//First Address
		AddressTwo a1= new AddressTwo();
		a1.setPincode(422008);
		a1.setArea("Trimurti Chowk");
		a1.setCity("Nashik");
		a1.setState("Maharashtra");
		//Second Address
		AddressTwo a2= new AddressTwo();
		a2.setPincode(422009);
		a2.setArea("Uttam Nagar");
		a2.setCity("Pune");
		a2.setState("Maharashtra");
		
		emp2.setAddress(a1);
		emp1.setAddress(a2);
		em.persist(emp1);
		em.persist(emp2);
		
		
		
		
		em.getTransaction().commit();
		System.out.println("Data Added Succesfully");
		em.close();
		factory.close();

		
	}



		

}

