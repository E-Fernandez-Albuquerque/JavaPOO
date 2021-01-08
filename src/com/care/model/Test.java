package com.care.model;

import java.util.Scanner;

import com.care.controller.FuncoesBD;

public class Test {

	public static void main(String[] args) {
		FuncoesBD bd = new FuncoesBD();
		Scanner reader = new Scanner(System.in);
		/*
		bd.criarTableRegistro();
		
		
		
		System.out.println("cpf:");
		String cpf = reader.nextLine();
		
		bd.criarTableConsultas(cpf);
		*/
		
		String login, senha;
		
		System.out.println("login: ");
		login = reader.next();
		System.out.println("senha: ");
		senha = reader.next();
		
		
		bd.verificaLogin(login, senha);
		
		reader.close();
	}

}
