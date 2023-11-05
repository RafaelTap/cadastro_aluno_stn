package com.outlook.rafael_taparica.helper;

import javax.persistence.EntityManager;

import com.outlook.rafael_taparica.entity.Aluno;

public class Helper {

	private EntityManager em;

	public Helper(EntityManager em) {
		this.em = em;
	}

	/* INSERT
	 * método para adicionar um novo aluno.
	 */
	public String adicionarAluno(String nome, String cpf, String email, String telefone,
			String dataNascimento) {

		Aluno aluno = new Aluno();
		aluno.setNome(nome);
		aluno.setCpf(cpf);
		aluno.setEmail(email);
		aluno.setTelefone(telefone);
		aluno.setDataNascimento(dataNascimento);

		em.getTransaction().begin();
		em.persist(aluno);
		em.getTransaction().commit();

		return "aluno cadastrado";

	}

	/*DELETE
	 * método para deletar um aluno pelo seu id.
	 */
	public String deletarAluno(int idAluno) {

		Aluno aluno = em.find(Aluno.class, idAluno);
		aluno.getIdAluno();

		em.getTransaction().begin();
		em.remove(aluno);
		em.getTransaction().commit();

		return "aluno deletado";
	}
	
	
	/* MODIFY
	 * método para atualizar e-mail do aluno.
	 */
	public String atualizarEmail (int idAluno, String email) {
		
		Aluno aluno = em.find(Aluno.class, idAluno);
		aluno.setEmail(email);
		
		em.getTransaction().begin();
		em.merge(aluno);
		em.getTransaction().commit();
		
		return "idade atualizada";
	}

	/* MODIFY
	 * método para atualizar o telefone do aluno.
	 */
	public String atualizarTelefone (int idAluno, String telefone) {
		
		Aluno aluno = em.find(Aluno.class, idAluno);
		aluno.setTelefone(telefone);
		
		em.getTransaction().begin();
		em.merge(aluno);
		em.getTransaction().commit();
		
		return "contato atualizada";
	}
}
