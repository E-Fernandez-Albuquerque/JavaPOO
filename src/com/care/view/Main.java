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
		String logins[] = {"eric", "fernandez"};
		String senhas[] = {"1234", "abcd"};
		ImageIcon icon = new ImageIcon("src/imgs/check.png");
		ImageIcon medical = new ImageIcon("src/imgs/medical.png");

		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(450, 200, 450, 253);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Medical Care");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 23, 414, 35);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Login: ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(68, 78, 62, 25);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Senha:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_1.setBounds(68, 103, 62, 25);
		contentPane.add(lblNewLabel_1_1);
		
		txtLogin = new JTextField();
		txtLogin.setBounds(140, 82, 194, 20);
		txtLogin.setBorder(null);
		contentPane.add(txtLogin);
		txtLogin.setColumns(10);
		
		passSenha = new JPasswordField();
		passSenha.setBounds(140, 107, 194, 20);
		passSenha.setBorder(null);
		contentPane.add(passSenha);
		
		JButton btnEntrar = new JButton("", icon);
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon iconError = new ImageIcon("src/imgs/fail.png");
				boolean login = false;
				boolean senha = false;
				
				for(int i = 0; i < logins.length; i++) {
					
					login = txtLogin.getText().equals(logins[i]);
					senha = new String (passSenha.getPassword()).equals(senhas[i]);
					
					if(login == true && senha == true) {
						break;
					}
					
				}
				
				
				if (login == true && senha == true) {
					Logado screen = new Logado();
					screen.setVisible(true);
				} else {
					JOptionPane.showMessageDialog(null, "Usu�rio ou senha incorretos. Tente novamente", "Login Error", JOptionPane.ERROR_MESSAGE, iconError);
				}
			}
		}
		);
		
		
		btnEntrar.setBounds(270, 139, 64, 64);
		contentPane.add(btnEntrar);
		btnEntrar.setBorder(null);
		btnEntrar.setBackground(null);
		
		JLabel lblStatus = new JLabel("");
		lblStatus.setBounds(198, 222, 46, 14);
		contentPane.add(lblStatus);
		
		JLabel iconFrame = new JLabel(medical);
		iconFrame.setBounds(66, 11, 64, 64);
		contentPane.add(iconFrame);
		
		JLabel lblNewLabel_2 = new JLabel("Acompanhamento de pacientes");
		lblNewLabel_2.setBounds(155, 50, 194, 14);
		contentPane.add(lblNewLabel_2);
	}
}
