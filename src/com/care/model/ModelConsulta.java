package com.care.model;

public class ModelConsulta {
	
	private String especialidadeMedica;
	private String obs;
	private String data;
	
	public ModelConsulta () {
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
