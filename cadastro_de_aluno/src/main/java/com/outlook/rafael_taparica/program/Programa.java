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
		
		//dao.adicionarAluno("Michel Boiteux", 42, "86537215434", "mb@mail.com", "21936452434", "06/02/1981");
		//dao.adicionarAluno("Leonardo lima", 38, "47255554433", "leo@mail.com", "21974653235", "09/12/1985");
		//dao.adicionarAluno("Marcos Cazuza", 57, "74352233987", "cazuza@mail.com", "21988443355", "11/04/1966");
		//dao.adicionarAluno("Lucas Sotero", 23, "13245436456", "lucas@mail.com", "21975565434", "06/02/2000");
		//dao.adicionarAluno("Igor Almassy", 23, "65464563324", "igor@mail.com", "21988667564", "06/02/2000");
		//dao.adicionarAluno("Paulo Araújo", 45, "33576533346", "p.araujo@mail.com", "21977769876", "14/08/1978");
		
		//dao.deletarAluno(9);
		
		//dao.atualizarEmail(1, "rafael.taparica@protonmail.com");
		
		dao.atualizarTelefone(3, "21990045543");
		
	}

}
