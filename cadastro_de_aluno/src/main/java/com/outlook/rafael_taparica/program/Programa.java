package com.outlook.rafael_taparica.program;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.outlook.rafael_taparica.helper.Helper;

public class Programa {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("cadastro_de_aluno");
		EntityManager em = emf.createEntityManager();
		
		@SuppressWarnings("unused")
		Helper dao = new Helper(em);
		
		//dao.adicionarAluno("Michel Boiteux", "86537215434", "mb@mail.com", "21936452434", "06/02/1981");
		//dao.adicionarAluno("Leonardo lima", "47255554433", "leo@mail.com", "21974653235", "09/12/1985");
		//dao.adicionarAluno("Marcos Cazuza", "74352233987", "cazuza@mail.com", "21988443355", "11/04/1966");
		//dao.adicionarAluno("Lucas Sotero", "13245436456", "lucas@mail.com", "21975565434", "06/02/2000");
		//dao.adicionarAluno("Igor Almassy", "65464563324", "igor@mail.com", "21988667564", "06/02/2000");
		//dao.adicionarAluno("Paulo Araújo", "33576533346", "p.araujo@mail.com", "21977769876", "14/08/1978");
		//dao.adicionarAluno("Paulo Neto", "10656664576", "paulinho@mail.com", "21977769876", "14/08/2012");
		//dao.adicionarAluno("Juan Silva", "38763401245", "juan@mail.com", "21956784761", "14/08/2013");
		
		//dao.deletarAluno(9);
		
		//dao.atualizarEmail(1, "rafael.taparica@protonmail.com");
		
		//dao.atualizarTelefone(3, "21990045543");
		
		//dao.listaDeAlunos();
		
		//dao.adicionarResponsavel("Marcos de Souza", "23464538091", "msouza@mail.com", "21965847463", 10);
		//dao.adicionarResponsavel("Marina Mendes", "22347566912", "marinam@mail.com", "21977546445", 11);
		
		
	}

}
