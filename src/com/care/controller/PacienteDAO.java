package com.care.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.care.model.ConexaoBD;
import com.care.model.ModelPaciente;

public class PacienteDAO {
	
	public void cadastroPaciente(ModelPaciente paciente){
		Connection conexao = ConexaoBD.conectarBD();
		PreparedStatement statement = null;
		
		try {
			statement = conexao.prepareStatement("INSERT INTO pacientes_cadastrados (nome, cpf, rg, telefone, nascimento, endereco, numero, obs, email) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)");
			statement.setString(1, paciente.getNome());
			statement.setString(2, paciente.getCpf());
			statement.setString(3, paciente.getRg());
			statement.setString(4, paciente.getTelefone());
			statement.setString(5, paciente.getNascimento());
			statement.setString(6, paciente.getEndereco());
			statement.setString(7, paciente.getNumeroEndereco());
			statement.setString(8, paciente.getObs());
			statement.setString(9, paciente.getEmail());
			
			statement.executeUpdate();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
	
	public void criarBancoConsultasPaciente(ModelPaciente paciente) {
		Connection conexao = ConexaoBD.conectarBD();
		PreparedStatement statement = null;
		
		try {
			statement = conexao.prepareStatement("CREATE TABLE IF NOT EXISTS _" + paciente.getRg() + "(id INT AUTO_INCREMENT PRIMARY KEY, "
					+ "data varchar(10), "
					+ "especialidadeMedica varchar(100) NOT NULL, "
					+ "obsConsulta TEXT)");
			statement.executeUpdate();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
}
