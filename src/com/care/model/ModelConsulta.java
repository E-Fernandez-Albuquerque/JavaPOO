package com.care.model;

public class ModelConsulta {
	
	private String especialidadeMedica;
	private String obs;
	private String data;
	
	public ModelConsulta () {
		
	}
	
	public ModelConsulta(String especialidadeMedica, String obs, String data) {
		this.especialidadeMedica = especialidadeMedica;
		this.obs = obs;
		this.data = data;
	}

	public String getEspecialidadeMedica() {
		return especialidadeMedica;
	}

	public void setEspecialidadeMedica(String especialidadeMedica) {
		this.especialidadeMedica = especialidadeMedica;
	}

	public String getObs() {
		return obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
	

}
