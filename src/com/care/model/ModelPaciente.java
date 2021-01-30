package com.care.model;

public class ModelPaciente extends ModelPessoas {
	
	/*private String nome;
	private String cpf;
	private String rg;
	private String telefone;
	private String nascimento;
	*/
	private String endereco;
	private String numeroEndereco;
	private String obs;
	
	public ModelPaciente () {
		
	}
	
	public ModelPaciente(String nome, String cpf, String rg, String telefone, String nascimento, String endereco, String numeroEndereco, String obs, String email) {
		this.setNome(nome);
		this.setCpf(cpf);
		this.setRg(rg);
		this.setTelefone(telefone);
		this.setNascimento(nascimento);
		this.setEmail(email);
		this.endereco = endereco;
		this.numeroEndereco = numeroEndereco;
		this.obs = obs;
		
	}

	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
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

		
	public void cadastrarPaciente(ModelPaciente paciente) {
		
	}

}
	
