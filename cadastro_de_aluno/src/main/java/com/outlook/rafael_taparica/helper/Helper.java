package com.outlook.rafael_taparica.helper;

import java.util.List;

import javax.persistence.EntityManager;

import com.outlook.rafael_taparica.entity.Aluno;
import com.outlook.rafael_taparica.entity.Endereco;
import com.outlook.rafael_taparica.entity.Responsavel;

public class Helper {

	private EntityManager em;

	public Helper(EntityManager em) {
		this.em = em;
	}

	/*
	 * INSERT método para adicionar um novo aluno.
	 */
	public String adicionarAluno(String nome, String cpf, String email, String telefone, String dataNascimento) {

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

	/*
	 * DELETE método para deletar um aluno pelo seu id.
	 */
	public String deletarAluno(int idAluno) {

		Aluno aluno = em.find(Aluno.class, idAluno);
		aluno.getIdAluno();

		em.getTransaction().begin();
		em.remove(aluno);
		em.getTransaction().commit();

		return "aluno deletado";
	}

	/*
	 * MODIFY método para atualizar e-mail do aluno.
	 */
	public String atualizarEmail(int idAluno, String email) {

		Aluno aluno = em.find(Aluno.class, idAluno);
		aluno.setEmail(email);

		em.getTransaction().begin();
		em.merge(aluno);
		em.getTransaction().commit();

		return "idade atualizada";
	}

	/*
	 * MODIFY método para atualizar o telefone do aluno.
	 */
	public String atualizarTelefone(int idAluno, String telefone) {

		Aluno aluno = em.find(Aluno.class, idAluno);
		aluno.setTelefone(telefone);

		em.getTransaction().begin();
		em.merge(aluno);
		em.getTransaction().commit();

		return "contato atualizada";
	}

	/*
	 * Método para listar todos os alunos, sem paginação.
	 */

	public void listaDeAlunos() {

		List<Aluno> listaCompleta = em.createQuery("SELECT a FROM Aluno a", Aluno.class).getResultList();

		for (Aluno listaDeAlunos : listaCompleta) {

			System.out.println("Id: " + listaDeAlunos.getIdAluno() + " Nome: " + listaDeAlunos.getNome() + " cpf: "
					+ listaDeAlunos.getCpf() + " Telefone: " + listaDeAlunos.getTelefone() + " Data de nascimento: "
					+ listaDeAlunos.getDataNascimento());
		}

	}

	// método relacionado ao responsável. //

	public void adicionarResponsavel(String nome, String cpf, String emil, String telefone, int aluno_idAluno) {

		Responsavel responsavel = new Responsavel();
		responsavel.setNome(nome);
		responsavel.setCpf(cpf);
		responsavel.setEmail(emil);
		responsavel.setTelefone(telefone);
		responsavel.setAluno_idAluno(aluno_idAluno);

		em.getTransaction().begin();
		em.persist(responsavel);
		em.getTransaction().commit();

	}

	// método relacionado ao endereço //

	public void adicionarEndereco(String logradouro, int numero, String cep, String complemento, String cidade, String UF, int aluno_idAluno) {
		
		Endereco endereco = new Endereco();
		endereco.setLogradouro(logradouro);
		endereco.setNumero(numero);
		endereco.setCep(cep);
		endereco.setComplemento(complemento);
		endereco.setCidade(cidade);
		endereco.setUF(UF);
		endereco.setAluno_idAluno(aluno_idAluno);
		
		em.getTransaction().begin();
		em.persist(endereco);
		em.getTransaction().commit();
	}
}
