package com.care.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.care.model.ConexaoBD;
import com.care.model.ModelColaborador;

public class ColaboradorDAO {

	// FUNÇÃO PARA CADASTRAR UM NOVO COLABORADOR
	public void cadastroColaborador(ModelColaborador colaborador) {
		Connection conexao = ConexaoBD.conectarBD();
		PreparedStatement statement = null;

		try {
			statement = conexao.prepareStatement(
					"INSERT INTO colaboradores_shell (nome, cpf, rg, telefone, nascimento, especialidadeMedica, login, senha) VALUES (?, ?, ?, ?, ?, ?, ?, ?)");
			statement.setString(1, colaborador.getNome());
			statement.setString(2, colaborador.getCpf());
			statement.setString(3, colaborador.getRg());
			statement.setString(4, colaborador.getTelefone());
			statement.setString(5, colaborador.getNascimento());
			statement.setString(6, colaborador.getEspecialidadeMedica());
			statement.setString(7, colaborador.getLogin());
			statement.setString(8, colaborador.getSenha());

			statement.executeUpdate();

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	public void criarTableColaboradores() {
		Connection conexao = ConexaoBD.conectarBD();
		PreparedStatement statement = null;
		try {
			statement = conexao.prepareStatement(
					"CREATE TABLE IF NOT EXISTS colaboradores_shell " + "(id int AUTO_INCREMENT PRIMARY KEY, "
							+ "nome varchar(255) NOT NULL, " + "cpf varchar(14) NOT NULL UNIQUE, "
							+ "rg varchar(14) NOT NULL, " + "telefone varchar(16) NOT NULL, "
							+ "nascimento varchar(10) NOT NULL, " + "especialidadeMedica varchar(255) NOT NULL, "
							+ "login varchar(20) NOT NULL, " + "senha varchar(20) NOT NULL)");
			statement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
