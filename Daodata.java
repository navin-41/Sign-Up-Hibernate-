package com.hiber;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Daodata {
		public static void ing(Dtodataa ct1)
		{
			EntityManagerFactory e11=Persistence.createEntityManagerFactory("perk");
			
			EntityManager e22=e11.createEntityManager();
			
			EntityTransaction et=e22.getTransaction();
			
			et.begin();
			e22.persist(ct1);
			et.commit();
		}
}


