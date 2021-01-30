package com.care.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.care.model.ConexaoBD;

public class FuncoesBD {

	

	public void criarTableRegistro() {
		Connection conexao = ConexaoBD.conectarBD();
		PreparedStatement statement = null;
		try {
			statement = conexao.prepareStatement("CREATE TABLE IF NOT EXISTS pacientes_cadastrados "
					+ "(id int AUTO_INCREMENT PRIMARY KEY, " + "nome varchar(255) NOT NULL, "
					+ "cpf varchar(14) NOT NULL UNIQUE, " + "rg varchar(14) NOT NULL, "
					+ "telefone varchar(16) NOT NULL, " + "nascimento varchar(10) NOT NULL, "
					+ "cep varchar(10) NOT NULL, " + "rua varchar(60) NOT NULL, " + "numero varchar(6) NOT NULL, "
					+ "obs TEXT, " + "email varchar(80) NOT NULL)");
			statement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void criarTableConsultas(String cpf) {
		Connection conexao = ConexaoBD.conectarBD();
		PreparedStatement statement = null;

		try {
			statement = conexao.prepareStatement("CREATE TABLE IF NOT EXISTS _" + cpf + "(nome varchar(255), "
					+ "cpf varchar(14) NOT NULL, " + "data varchar(10), " + "especialidadeMedica varchar(255), "
					+ "observacoesConsulta TEXT)");
			statement.executeUpdate();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}

	public boolean verificaLogin(String login, String senha) {
		Connection conexao = ConexaoBD.conectarBD();
		PreparedStatement statement = null;

		login.toString();

		try {
			statement = conexao.prepareStatement("SELECT * FROM colaboradores_shell WHERE login LIKE '" + login + "'");
			ResultSet var = statement.executeQuery();

			while (var.next()) {
				String log = var.getString("login");
				String pass = var.getString("senha");

				if (log.equals(login) && pass.equals(senha)) {
					System.out.println("Login realizado");
					return true;
				}
			}

		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		System.out.println("Não confere");
		return false;
	}

}
