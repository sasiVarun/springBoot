package com.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.test.entity.Employee;

public class Test {

	public static void main(String[] args) {
		EntityTransaction tx = null;
		try {
			//1. (Loads Driver, Creates DB Connections, Prepare stmt)
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("AppDB");
			
			//2. (TODO Operations--insert, update,....)
			EntityManager em = emf.createEntityManager();
			
			//3. create Transaction
			tx = em.getTransaction();
			
			//4. Start Transaction
			tx.begin();
			
			//5. Perform operation
			//save data into DB
			Employee emp = new Employee();
			emp.setEmpId(100);
			emp.setEmpName("SAM");
			emp.setEmpSal(200.00);
			
			em.persist(emp);//SQL: INSERT INTO ...
			
			//6. commit
			tx.commit();
			
		} catch (Exception e) {
			//rollback if any problem
			tx.rollback();
			e.printStackTrace();
		}
	}
}
