package com.care.view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.text.MaskFormatter;

import com.care.controller.PacienteDAO;
import com.care.model.ModelPaciente;

import javax.swing.JFormattedTextField;
import javax.swing.SwingConstants;

public class PeoplePlus extends JFrame {

	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtMail;
	private JTextField txtAddress;
	private JTextField txtNumber;

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
	 *
	 */
	public PeoplePlus(){
		
		ModelPaciente paciente = new ModelPaciente();
		
		//WINDOW_TITLE
		setTitle("Adicionar paciente");
		
		
		//WINDOW_TITLE:
		setTitle("Adicionar paciente");
		
		
		//WINDOW_RESIZE:
		setResizable(false);
		
		
		//ICONS:
		ImageIcon medical = new ImageIcon("src/imgs/medicalMicro.png");
		ImageIcon back = new ImageIcon("src/imgs/back.png");
		ImageIcon check = new ImageIcon("src/imgs/check.png");
		
		
		//JFRAME:
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 762, 454);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		//LABELS:
		//Name
		JLabel lblName = new JLabel("Nome:");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblName.setBounds(10, 71, 46, 14);
		contentPane.add(lblName);
		
		//Birth
		JLabel lblBirth = new JLabel("Data de nascimento:");
		lblBirth.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblBirth.setBounds(10, 113, 133, 14);
		contentPane.add(lblBirth);
		
		//CPF
		JLabel lblCPF = new JLabel("CPF: ");
		lblCPF.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCPF.setBounds(313, 72, 46, 14);
		contentPane.add(lblCPF);
		
		//RG
		JLabel lblRG = new JLabel("RG:");
		lblRG.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblRG.setBounds(313, 113, 46, 14);
		contentPane.add(lblRG);
		
		//Phone
		JLabel lblPhone = new JLabel("Telefone: ");
		lblPhone.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPhone.setBounds(530, 71, 60, 14);
		contentPane.add(lblPhone);
		
		//Mail
		JLabel lblMail = new JLabel("Email:");
		lblMail.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMail.setBounds(530, 113, 46, 14);
		contentPane.add(lblMail);
		
		//Address
		JLabel lblAddress = new JLabel("Endere\u00E7o:");
		lblAddress.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAddress.setBounds(10, 152, 69, 19);
		contentPane.add(lblAddress);
		
		//Number
		JLabel lblNumber = new JLabel("N\u00FAmero:");
		lblNumber.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNumber.setBounds(530, 152, 69, 19);
		contentPane.add(lblNumber);
		
		//Obs
		JLabel lblObs = new JLabel("Observa\u00E7\u00F5es do paciente:");
		lblObs.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblObs.setBounds(10, 194, 164, 19);
		contentPane.add(lblObs);
		
		//Title
		JLabel lblTitle = new JLabel("Cadastro de paciente");
		lblTitle.setFont(new Font("Tw Cen MT", Font.PLAIN, 30));
		lblTitle.setBounds(76, 15, 319, 30);
		contentPane.add(lblTitle);
		
		//Icon
		JLabel lblIcon = new JLabel(medical);
		lblIcon.setBounds(685, 11, 48, 48);
		contentPane.add(lblIcon);
		
		//Save
		JLabel lblNewLabel = new JLabel("Salvar");
		lblNewLabel.setFont(new Font("Tw Cen MT", Font.PLAIN, 12));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(685, 396, 46, 14);
		contentPane.add(lblNewLabel);
		
		
		//MASKS: Criação das máscaras necessárias para formulário
		//Birth
		MaskFormatter fmtBirth = null;
		try {
			fmtBirth = new MaskFormatter("##/##/####");
		} catch (ParseException e1) {
			e1.printStackTrace();
		}

				
		//CPF
		MaskFormatter fmtCPF = null;
		try {
			fmtCPF = new MaskFormatter("###.###.###-##");
		} catch (ParseException e1) {
			e1.printStackTrace();
		}

				
		//Phone
		MaskFormatter fmtPhone = null;
		try {
			fmtPhone = new MaskFormatter("(##) #.####-####");
		} catch (ParseException e1) {
			e1.printStackTrace();
		}

		
		//INPUTS:
		//Name
		txtName = new JTextField();
		txtName.setBounds(57, 70, 214, 20);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		//Mail
		txtMail = new JTextField();
		txtMail.setColumns(10);
		txtMail.setBounds(600, 112, 133, 20);
		contentPane.add(txtMail);
		
		//Address
		txtAddress = new JTextField();
		txtAddress.setColumns(10);
		txtAddress.setBounds(89, 152, 400, 20);
		contentPane.add(txtAddress);
		
		//Number
		txtNumber = new JTextField();
		txtNumber.setColumns(10);
		txtNumber.setBounds(600, 152, 133, 20);
		contentPane.add(txtNumber);
		
		//Obs
		JTextArea txtObs = new JTextArea();
		txtObs.setBounds(10, 224, 723, 126);
		txtObs.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
		contentPane.add(txtObs);
		
		//RG
		JFormattedTextField JFRG = new JFormattedTextField();
		JFRG.setBounds(350, 112, 139, 20);
		contentPane.add(JFRG);
		
		//Phone
		JFormattedTextField JFPhone = new JFormattedTextField(fmtPhone);
		JFPhone.setBounds(600, 70, 133, 20);
		contentPane.add(JFPhone);	
		
		JFormattedTextField JFCPF = new JFormattedTextField(fmtCPF);
		JFCPF.setBounds(350, 70, 139, 20);
		contentPane.add(JFCPF);
		
		JFormattedTextField JFBirth = new JFormattedTextField(fmtBirth);
		JFBirth.setBounds(153, 112, 118, 20);
		contentPane.add(JFBirth);
		
		
		//BOTÕES:
		//Back
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
		
		//Check
		JButton btnCheck = new JButton("", check);
		btnCheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ModelPaciente paciente = new ModelPaciente();
				PacienteDAO dao = new PacienteDAO();
				
				paciente.setNome(txtName.getText());
				paciente.setEmail(txtMail.getText());
				paciente.setEndereco(txtAddress.getText());
				paciente.setNumeroEndereco(txtNumber.getText());
				paciente.setObs(txtObs.getText());
				paciente.setRg(JFRG.getText());
				paciente.setCpf(JFCPF.getText());
				paciente.setTelefone(JFPhone.getText());
				paciente.setNascimento(JFBirth.getText());
				
				dao.cadastroPaciente(paciente);
				dao.criarBancoConsultasPaciente(paciente);
				
				JOptionPane.showMessageDialog(null, "Novo paciente cadastrado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
		
				
				/*
				//Recebe os valores do campos do paciente de forma temporária
				temp[0] = txtName.getText();
				temp[1] = txtMail.getText();
				temp[2] = txtAddress.getText();
				temp[3] = txtNumber.getText();
				temp[4] = txtObs.getText();
				temp[5] = JFRG.getText();
				temp[6] = JFPhone.getText();
				temp[7] = JFCPF.getText();
				temp[8] = JFBirth.getText();
				
				//Transfere os valores recebidos no array temporário para o array "definitivo".
				for(int i = 0; i < 10; i++) {
					if (paciente[i][0] != null) {
						continue;
					}else{
						for(int j = 0; j < 9; j++) {
							paciente[i][j] = temp[j];
					}
				}
				for(i = 0; i < 10; i++) {
					if(paciente[i][0] == null) {
						continue;
					}else {
						for(int j = 0; j < 9; j++) {
						System.out.println(paciente[i][j]);
						}
					}
					
				}
				JOptionPane.showMessageDialog(null, "Paciente cadastrado com sucesso");
				*/
			}
		});
		btnCheck.setBorder(null);
		btnCheck.setBackground((Color) null);
		btnCheck.setBounds(685, 350, 48, 48);
		contentPane.add(btnCheck);
	}
}
