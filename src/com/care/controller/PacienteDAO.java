package com.care.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import com.care.model.ConexaoBD;
import com.care.model.ModelPaciente;

public class PacienteDAO {

	// FUNÇÃO PARA CADASTRAR UM NOVO PACIENTE
	public void cadastroPaciente(ModelPaciente paciente) {
		Connection conexao = ConexaoBD.conectarBD();
		PreparedStatement statement = null;

		try {
			statement = conexao.prepareStatement(
					"INSERT INTO pacientes_cadastrados (nome, cpf, rg, telefone, nascimento, endereco, numero, obs, email) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)");
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

	// CRIAR A TABLE QUE ARMAZENARÁ OS REGISTROS DE CONSULTA DO PACIENTE
	// RECÉM-CADASTRADO
	public void criarBancoConsultasPaciente(ModelPaciente paciente) {
		Connection conexao = ConexaoBD.conectarBD();
		PreparedStatement statement = null;

		try {
			statement = conexao.prepareStatement("CREATE TABLE IF NOT EXISTS _" + paciente.getRg()
					+ "(id INT AUTO_INCREMENT PRIMARY KEY, " + "data varchar(10), "
					+ "especialidadeMedica varchar(100) NOT NULL, " + "obsConsulta TEXT)");
			statement.executeUpdate();

		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

	// REALIZA A BUSCA DO PACIENTE A PARTIR DAS INFORMAÇÕES FORNECIDAS
	public boolean buscaPaciente(ModelPaciente paciente) {

		Connection conexao = ConexaoBD.conectarBD();
		PreparedStatement statement = null;
		String nome = null, cpf = null, rg = null;

		try {
			statement = conexao.prepareStatement("SELECT * FROM pacientes_cadastrados WHERE rg LIKE '" + paciente.getRg() + "' OR cpf LIKE '" + paciente.getCpf() +"' OR nome LIKE '" + paciente.getNome() + "'");
			ResultSet var = statement.executeQuery();
			
			while (var.next()) {
				nome = var.getString("nome");
				rg = var.getString("rg");
				cpf = var.getString("cpf");
			}
			if (rg != null) {
				paciente.setNome(nome);
				paciente.setRg(rg);
				paciente.setCpf(cpf);
				System.out.printf("%s, %s, %s", rg, cpf, nome);
				return true;
			}else {
				JOptionPane.showMessageDialog(null, "Paciente não encontrado! Por favor, tente novamente!", "Não encontrado", JOptionPane.INFORMATION_MESSAGE);
			}
			
			
		} catch (SQLException ex) {
			System.out.println("ERRO AQUI");
			ex.printStackTrace();
		}
		
		return false;
	}
}
