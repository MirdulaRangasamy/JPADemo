package com.jpa.JPADemo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.jpa.JPADemo.entity.Laptop;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Laptop l1;
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("laptop_pu");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        
        l1 = em.find(Laptop.class, 102);
        em.remove(l1);
        em.getTransaction().commit();
    }
}
