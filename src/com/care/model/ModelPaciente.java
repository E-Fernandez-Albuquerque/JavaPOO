package com.care.model;

public class ModelPaciente {
	
	private String nome;
	private String cpf;
	private String rg;
	private String telefone;
	private String nascimento;
	private String endereco;
	private String rua;
	private String numeroEndereco;
	private String obs;
	private String email;
	
	public ModelPaciente () {
		
	}
	
	public ModelPaciente(String nome, String cpf, String rg, String telefone, String nascimento, String endereco, String numeroEndereco, String obs, String email) {
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.telefone = telefone;
		this.nascimento = nascimento;
		this.endereco = endereco;
		this.numeroEndereco = numeroEndereco;
		this.obs = obs;
		this.email = email;
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

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getNascimento() {
		return nascimento;
	}

	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}

	public String getEndereco() {
		return rua;
	}

	public void setEndereco(String rua) {
		this.rua = rua;
	}

	public String getNumeroEndereco() {
		return numeroEndereco;
	}

	public void setNumeroEndereco(String numeroEndereco) {
		this.numeroEndereco = numeroEndereco;
	}

	public String getObs() {
		return obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
		
	public void cadastrarPaciente(ModelPaciente paciente) {
		
	}

}
	
