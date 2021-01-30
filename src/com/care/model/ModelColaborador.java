package com.care.model;

public class ModelColaborador extends ModelPessoas{
	
	private String especialidadeMedica;
	private String login;
	private String senha;
	
	public ModelColaborador(String nome, String cpf, String rg, String telefone, String email, String nascimento, String especialidadeMedica, String login, String senha) {
		this.setNome(nome);
		this.setCpf(cpf);
		this.setRg(rg);
		this.setTelefone(telefone);
		this.setNascimento(nascimento);
		this.setEmail(email);
		this.especialidadeMedica = especialidadeMedica;
		this.login = login;
		this.senha = senha;
	}
	
	public ModelColaborador() {
		
	}
	
	
	public String getEspecialidadeMedica() {
		return especialidadeMedica;
	}
	public void setEspecialidadeMedica(String especialidadeMedica) {
		this.especialidadeMedica = especialidadeMedica;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	

}
