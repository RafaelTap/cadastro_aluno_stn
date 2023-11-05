package com.outlook.rafael_taparica.helper;

import javax.persistence.EntityManager;

import com.outlook.rafael_taparica.entity.Aluno;

public class Helper {

	private EntityManager em;

	public Helper(EntityManager em) {
		this.em = em;
	}

	public String adicionarAluno(String nome, int idade, String cpf, String email, String telefone,
			String dataNascimento) {

		Aluno aluno = new Aluno();
		aluno.setNome(nome);
		aluno.setIdade(idade);
		aluno.setCpf(cpf);
		aluno.setEmail(email);
		aluno.setTelefone(telefone);
		aluno.setDataNascimento(dataNascimento);

		em.getTransaction().begin();
		em.persist(aluno);
		em.getTransaction().commit();

		return "aluno cadastrado";

	}

}
