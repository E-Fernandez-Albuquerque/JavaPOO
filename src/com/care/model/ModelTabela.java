package com.care.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

public class ModelTabela {

	private ArrayList<String> data = new ArrayList<String>();
	private ArrayList<String> especialidade = new ArrayList<String>();
	private ArrayList<String> observacoes = new ArrayList<String>();
	
	
	public ArrayList<String> getData() {
		return data;
	}


	public void setData(ArrayList<String> data) {
		this.data = data;
	}


	public ArrayList<String> getEspecialidade() {
		return especialidade;
	}


	public void setEspecialidade(ArrayList<String> especialidade) {
		this.especialidade = especialidade;
	}


	public ArrayList<String> getObservacoes() {
		return observacoes;
	}


	public void setObservacoes(ArrayList<String> observacoes) {
		this.observacoes = observacoes;
	}


	public void retornaHistorico(ModelPaciente paciente) {

		Connection conexao = ConexaoBD.conectarBD();
		PreparedStatement statement = null;
		String dt = null, esp = null, obs = null;

		try {
			statement = conexao.prepareStatement("SELECT * FROM _" + paciente.getRg());
			ResultSet var = statement.executeQuery();
			
			while (var.next()) {
				int c = 0;
				dt = var.getString("data");
				this.data.add(dt);
				esp = var.getString("especialidadeMedica");
				this.especialidade.add(esp);
				obs = var.getString("obsConsulta");
				this.observacoes.add(obs);
			}
		}catch (SQLException e){
			e.printStackTrace();
		}
	}
}
