package com.outlook.rafael_taparica.program;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.outlook.rafael_taparica.helper.Helper;

public class Programa {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("cadastro_de_aluno");
		EntityManager em = emf.createEntityManager();
		
		Helper dao = new Helper(em);
		
		dao.adicionarAluno(1, "rafael Taparica", 30, "13850765776", "rafael@mail.cm", "967813777", "16/02/1990");
		
		emf.close();
		em.close();
	}

}
