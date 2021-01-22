package com.care.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.care.model.ConexaoBD;
import com.care.model.ModelConsulta;
import com.care.model.ModelPaciente;

public class ConsultaDAO {
	
	public void registraConsulta(ModelPaciente paciente, ModelConsulta consulta) {
		Connection conexao = ConexaoBD.conectarBD();
		PreparedStatement statement = null;
		
		try {
			statement = conexao.prepareStatement("INSERT INTO _" + paciente.getRg() + " (data, especialidadeMedica, obsConsulta) VALUES (?, ?, ?)");
			statement.setString(1, consulta.getData());
			statement.setString(2, consulta.getEspecialidadeMedica());
			statement.setString(3, consulta.getObs());
			statement.executeUpdate();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
				
	}

}
