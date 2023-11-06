package com.outlook.rafael_taparica.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "aluno")
public class Aluno {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idAluno;

	@Column
	private String nome;

	@Column
	private String cpf;

	@Column
	private String email;

	@Column
	private String telefone;

	@Column
	private String dataNascimento;
	
	@OneToOne 
	@JoinColumn (name = "aluno_idAluno")
	private Endereco endereco;
	
	@OneToOne
	@JoinColumn (name = "aluno_idAluno1")
	private Responsavel responsavel;

	public int getIdAluno() {
		return idAluno;
	}

	public void setIdAluno(int idAluno) {
		this.idAluno = idAluno;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento2) {
		this.dataNascimento = dataNascimento2;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public Responsavel getResponsavel() {
		return responsavel;
	}
	
	

}
