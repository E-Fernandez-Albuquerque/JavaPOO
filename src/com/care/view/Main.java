package com.care.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main extends JFrame {

	/**
	 * 
	 */
	private JPanel contentPane;
	private JTextField txtLogin;
	private JPasswordField passSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main() {
		
		//WINDOW_TITLE
		setTitle("Login");
		
		//WINDOW_RESIZE:
		setResizable(false);
		
		//LOGIN & SENHA:
		//Arrays para validação do login até conhecimentos necessários de Banco de Dados com Java
		String logins[] = {"eric", "erick", "marcelo"};
		String senhas[] = {"1234", "abcd", "xyz"};
		
		
		//ICONS: Carrega imagens utilizadas como ícones durante o projeto
		ImageIcon icon = new ImageIcon("src/imgs/check.png");
		ImageIcon medical = new ImageIcon("src/imgs/medical.png");
		ImageIcon iconError = new ImageIcon("src/imgs/fail.png");

		
		//JFRAME:
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 195);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		//LABELS:
		//Title
		JLabel lblNewLabel = new JLabel("Medical Shell");
		lblNewLabel.setFont(new Font("Tw Cen MT", Font.PLAIN, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(46, 23, 378, 35);
		contentPane.add(lblNewLabel);
		
		//Login
		JLabel lblNewLabel_1 = new JLabel("Login: ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(68, 78, 62, 25);
		contentPane.add(lblNewLabel_1);
		
		//Password
		JLabel lblNewLabel_1_1 = new JLabel("Senha:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_1.setBounds(68, 103, 62, 25);
		contentPane.add(lblNewLabel_1_1);
		
		//Icon
		JLabel iconFrame = new JLabel(medical);
		iconFrame.setBounds(66, 11, 64, 64);
		contentPane.add(iconFrame);
		
		//Subtitle
		JLabel lblNewLabel_2 = new JLabel("Acompanhamento de pacientes");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_2.setBounds(155, 50, 194, 14);
		contentPane.add(lblNewLabel_2);
		
		
		//INPUTS:
		//Login
		txtLogin = new JTextField();
		txtLogin.setBounds(140, 82, 194, 20);
		txtLogin.setBorder(null);
		contentPane.add(txtLogin);
		txtLogin.setColumns(10);
		
		//Password
		passSenha = new JPasswordField();
		passSenha.setBounds(140, 107, 194, 20);
		passSenha.setBorder(null);
		contentPane.add(passSenha);
		
		
		//BUTTONS:
		//SingIn
		JButton btnEntrar = new JButton("", icon);
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				//Inicialização de variaveis booleanas de verificaão de login e senha com valores false
				boolean login = false;
				boolean senha = false;
				for(int i = 0; i < logins.length; i++) {
					
					login = txtLogin.getText().equals(logins[i]); //Recebimento do campo Login
					senha = new String (passSenha.getPassword()).equals(senhas[i]); //Recebimento do campo Senha
					
					if(login == true && senha == true) {
						break;
					}
				}
				
				//Verificação de variáveis Login e Senha como true or false
				if (login == true && senha == true) {
					Logado screen = new Logado();
					screen.setVisible(true);
					dispose();
				} else {
					JOptionPane.showMessageDialog(null, "Usuário ou senha incorretos. Tente novamente", "Login Error", JOptionPane.ERROR_MESSAGE, iconError);
				}
			}
		}
		);
		btnEntrar.setBounds(344, 69, 64, 64);
		contentPane.add(btnEntrar);
		btnEntrar.setBorder(null);
		btnEntrar.setBackground(null);
		
		
	}
}
