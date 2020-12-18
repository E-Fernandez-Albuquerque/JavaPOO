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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(450, 200, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Medical Care - Acompanhamento de pacientes");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 23, 414, 53);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Login: ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(68, 87, 62, 25);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Senha:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_1.setBounds(68, 131, 62, 25);
		contentPane.add(lblNewLabel_1_1);
		
		txtLogin = new JTextField();
		txtLogin.setBounds(140, 91, 194, 20);
		contentPane.add(txtLogin);
		txtLogin.setColumns(10);
		
		passSenha = new JPasswordField();
		passSenha.setBounds(140, 135, 194, 20);
		contentPane.add(passSenha);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtLogin.getText().equals("admin") && new String (passSenha.getPassword()).equals("1234")) {
					Logado screen = new Logado();
					screen.setVisible(true);
				} else {
					JOptionPane.showMessageDialog(null, "Usuário ou senha incorretos");
				}
			}
		}
		);
		btnEntrar.setBounds(245, 177, 89, 23);
		contentPane.add(btnEntrar);
		
		JLabel lblStatus = new JLabel("");
		lblStatus.setBounds(198, 222, 46, 14);
		contentPane.add(lblStatus);
	}
}
