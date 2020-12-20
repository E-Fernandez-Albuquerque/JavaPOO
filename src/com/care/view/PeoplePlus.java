package com.care.view;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class PeoplePlus extends JFrame {

	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtCPF;
	private JTextField txtRG;
	private JTextField txtBirth;
	private JTextField txtPhone;
	private JTextField txtMail;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PeoplePlus frame = new PeoplePlus();
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
	public PeoplePlus() {
		ImageIcon medical = new ImageIcon("src/imgs/medicalMicro.png");
		ImageIcon back = new ImageIcon("src/imgs/back.png");
		ImageIcon check = new ImageIcon("src/imgs/check.png");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 762, 454);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 71, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Data de nascimento:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(10, 113, 133, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("CPF: ");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(313, 72, 46, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("RG:");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_2.setBounds(313, 113, 46, 14);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Telefone: ");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_3.setBounds(530, 71, 60, 14);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Email:");
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_4.setBounds(530, 113, 46, 14);
		contentPane.add(lblNewLabel_1_4);
		
		txtName = new JTextField();
		txtName.setBounds(57, 70, 214, 20);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		txtCPF = new JTextField();
		txtCPF.setBounds(356, 70, 133, 20);
		contentPane.add(txtCPF);
		txtCPF.setColumns(10);
		
		txtRG = new JTextField();
		txtRG.setBounds(356, 112, 133, 20);
		contentPane.add(txtRG);
		txtRG.setColumns(10);
		
		txtBirth = new JTextField();
		txtBirth.setBounds(153, 112, 118, 20);
		contentPane.add(txtBirth);
		txtBirth.setColumns(10);
		
		txtPhone = new JTextField();
		txtPhone.setColumns(10);
		txtPhone.setBounds(600, 70, 133, 20);
		contentPane.add(txtPhone);
		
		txtMail = new JTextField();
		txtMail.setColumns(10);
		txtMail.setBounds(600, 112, 133, 20);
		contentPane.add(txtMail);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o:");
		lblEndereo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEndereo.setBounds(10, 152, 69, 19);
		contentPane.add(lblEndereo);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(89, 152, 400, 20);
		contentPane.add(textField);
		
		JLabel lblNmero = new JLabel("N\u00FAmero:");
		lblNmero.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNmero.setBounds(530, 152, 69, 19);
		contentPane.add(lblNmero);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(600, 152, 133, 20);
		contentPane.add(textField_1);
		
		JLabel lblObservaesDoPaciente = new JLabel("Observa\u00E7\u00F5es do paciente:");
		lblObservaesDoPaciente.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblObservaesDoPaciente.setBounds(10, 194, 164, 19);
		contentPane.add(lblObservaesDoPaciente);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 224, 723, 126);
		textArea.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
		contentPane.add(textArea);
		
		JLabel lblNewLabel_2 = new JLabel("Cadastro de paciente");
		lblNewLabel_2.setFont(new Font("Tw Cen MT", Font.PLAIN, 30));
		lblNewLabel_2.setBounds(76, 15, 319, 30);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel(medical);
		lblNewLabel_3.setBounds(685, 11, 48, 48);
		contentPane.add(lblNewLabel_3);
		
		JButton btnBack = new JButton("", back);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Logado screen = new Logado();
				screen.setVisible(true);
				dispose();
			}
		});
		btnBack.setBounds(8, 8, 48, 48);
		btnBack.setBackground(null);
		btnBack.setBorder(null);
		contentPane.add(btnBack);
		
		JButton btnCheck = new JButton("", check);
		btnCheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Paciente cadastrado com sucesso");
			}
		});
		btnCheck.setBorder(null);
		btnCheck.setBackground((Color) null);
		btnCheck.setBounds(685, 356, 48, 48);
		contentPane.add(btnCheck);
	}
}
