package com.care.view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

import com.care.controller.ColaboradorDAO;
import com.care.model.ModelColaborador;
import javax.swing.JPasswordField;

public class CadastroColaborador extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtMail;
	private JTextField txtEspecialidade;
	private JTextField txtLogin;
	private JPasswordField pswdSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroColaborador frame = new CadastroColaborador();
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
	public CadastroColaborador() {

		// WINDOW_TITLE
		setTitle("Cadastro de colaborador");

		// WINDOW_RESIZE:
		setResizable(false);

		// ICONS:
		ImageIcon medical = new ImageIcon("src/imgs/medicalMicro.png");
		ImageIcon back = new ImageIcon("src/imgs/back.png");
		ImageIcon check = new ImageIcon("src/imgs/check.png");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 781, 336);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		// MASKS: Criação das máscaras necessárias para formulário
		// Birth
		MaskFormatter fmtBirth = null;
		try {
			fmtBirth = new MaskFormatter("##/##/####");
		} catch (ParseException e1) {
			e1.printStackTrace();
		}

		// CPF
		MaskFormatter fmtCPF = null;
		try {
			fmtCPF = new MaskFormatter("###.###.###-##");
		} catch (ParseException e1) {
			e1.printStackTrace();
		}

		// Phone
		MaskFormatter fmtPhone = null;
		try {
			fmtPhone = new MaskFormatter("(##) #.####-####");
		} catch (ParseException e1) {
			e1.printStackTrace();
		}

		JLabel lblCadastroDePaciente = new JLabel("Cadastro de colaboradores");
		lblCadastroDePaciente.setFont(new Font("Tw Cen MT", Font.PLAIN, 30));
		lblCadastroDePaciente.setBounds(209, 11, 370, 30);
		contentPane.add(lblCadastroDePaciente);

		JButton btnBack = new JButton("", back);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Main screen = new Main();
				screen.setVisible(true);
				dispose();
			}
		});
		btnBack.setBorder(null);
		btnBack.setBackground((Color) null);
		btnBack.setBounds(12, 11, 48, 48);
		contentPane.add(btnBack);

		JLabel lblIcon = new JLabel(medical);
		lblIcon.setBounds(707, 11, 48, 48);
		contentPane.add(lblIcon);

		JLabel lblName = new JLabel("Nome:");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblName.setBounds(32, 71, 46, 14);
		contentPane.add(lblName);

		txtNome = new JTextField();
		txtNome.setColumns(10);
		txtNome.setBounds(79, 70, 214, 20);
		contentPane.add(txtNome);

		JLabel lblCPF = new JLabel("CPF: ");
		lblCPF.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCPF.setBounds(335, 72, 46, 14);
		contentPane.add(lblCPF);

		JFormattedTextField JFCPF = new JFormattedTextField(fmtCPF);
		JFCPF.setBounds(372, 70, 139, 20);
		contentPane.add(JFCPF);

		JLabel lblPhone = new JLabel("Telefone: ");
		lblPhone.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPhone.setBounds(552, 71, 60, 14);
		contentPane.add(lblPhone);

		JFormattedTextField JFPhone = new JFormattedTextField(fmtPhone);
		JFPhone.setBounds(622, 70, 133, 20);
		contentPane.add(JFPhone);

		JLabel lblBirth = new JLabel("Data de nascimento:");
		lblBirth.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblBirth.setBounds(32, 108, 133, 14);
		contentPane.add(lblBirth);

		JFormattedTextField JFBirth = new JFormattedTextField(fmtBirth);
		JFBirth.setBounds(175, 107, 118, 20);
		contentPane.add(JFBirth);

		JLabel lblRG = new JLabel("RG:");
		lblRG.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblRG.setBounds(335, 108, 46, 14);
		contentPane.add(lblRG);

		JFormattedTextField JFRG = new JFormattedTextField();
		JFRG.setBounds(372, 107, 139, 20);
		contentPane.add(JFRG);

		JLabel lblMail = new JLabel("Email:");
		lblMail.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMail.setBounds(552, 108, 46, 14);
		contentPane.add(lblMail);

		txtMail = new JTextField();
		txtMail.setColumns(10);
		txtMail.setBounds(622, 107, 133, 20);
		contentPane.add(txtMail);

		JLabel lblEspecialidadeMdica = new JLabel("Especialidade m\u00E9dica: ");
		lblEspecialidadeMdica.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEspecialidadeMdica.setBounds(32, 151, 139, 19);
		contentPane.add(lblEspecialidadeMdica);

		txtEspecialidade = new JTextField();
		txtEspecialidade.setColumns(10);
		txtEspecialidade.setBounds(175, 152, 580, 20);
		contentPane.add(txtEspecialidade);

		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSenha.setBounds(32, 226, 69, 19);
		contentPane.add(lblSenha);

		JLabel lblLogin = new JLabel("Login:");
		lblLogin.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblLogin.setBounds(32, 196, 69, 19);
		contentPane.add(lblLogin);

		txtLogin = new JTextField();
		txtLogin.setColumns(10);
		txtLogin.setBounds(102, 197, 133, 20);
		contentPane.add(txtLogin);

		JButton btnCheck = new JButton("", check);
		btnCheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ModelColaborador colaborador = new ModelColaborador();
				ColaboradorDAO dao = new ColaboradorDAO();
				dao.criarTableColaboradores();
				
				colaborador.setNome(txtNome.getText());
				colaborador.setRg(JFRG.getText());
				colaborador.setCpf(JFCPF.getText());
				colaborador.setTelefone(JFPhone.getText());
				colaborador.setNascimento(JFBirth.getText());
				colaborador.setEmail(txtMail.getText());
				colaborador.setEspecialidadeMedica(txtEspecialidade.getText());
				colaborador.setLogin(txtLogin.getText());
				colaborador.setSenha(new String(pswdSenha.getPassword()));
				
				dao.cadastroPaciente(colaborador);
				
				JOptionPane.showMessageDialog(null, "Novo colaborador cadastrado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btnCheck.setBorder(null);
		btnCheck.setBackground((Color) null);
		btnCheck.setBounds(707, 196, 48, 48);
		contentPane.add(btnCheck);

		JLabel lblNewLabel = new JLabel("Salvar");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tw Cen MT", Font.PLAIN, 12));
		lblNewLabel.setBounds(707, 242, 46, 14);
		contentPane.add(lblNewLabel);
		
		pswdSenha = new JPasswordField();
		pswdSenha.setBounds(102, 227, 133, 20);
		contentPane.add(pswdSenha);
	}
}
