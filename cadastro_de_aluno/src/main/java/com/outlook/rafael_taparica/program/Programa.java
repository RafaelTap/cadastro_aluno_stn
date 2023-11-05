package com.outlook.rafael_taparica.program;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Programa {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("cadastro_de_aluno");
		EntityManager em = emf.createEntityManager();
		
		
		
		em.close();
	}

}
