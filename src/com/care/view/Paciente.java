package com.care.view;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import com.care.model.ModelPaciente;

public class Paciente extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				/*
				 * try { Paciente frame = new Paciente(); frame.setVisible(true); } catch
				 * (Exception e) { e.printStackTrace(); }
				 */
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Paciente() {

		// WINDOW_TITLE
		setTitle("Paciente");

		// WINDOW_RESIZE:
		setResizable(false);

		// ICONS:
		ImageIcon medical = new ImageIcon("src/imgs/medicalMicro.png");
		ImageIcon historico = new ImageIcon("src/imgs/historico.png");
		ImageIcon registro = new ImageIcon("src/imgs/write.png");
		ImageIcon back = new ImageIcon("src/imgs/back.png");

		// JFRAME:
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 466, 250);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		// LABELS:
		// Title
		JLabel lblTitle = new JLabel("Acompanhamento do paciente");
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 30));
		lblTitle.setBounds(59, 11, 333, 33);
		contentPane.add(lblTitle);

		// Icon
		JLabel lblIcon = new JLabel(medical);
		lblIcon.setBounds(402, 0, 48, 48);
		contentPane.add(lblIcon);

		// Historico
		JLabel lblNewLabel_2 = new JLabel("Hist\u00F3rico");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(118, 186, 64, 14);
		contentPane.add(lblNewLabel_2);

		// Nome paciente
		JLabel lblNomePaciente = new JLabel();
		lblNomePaciente.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblNomePaciente.setHorizontalAlignment(SwingConstants.LEFT);
		lblNomePaciente.setBounds(92, 55, 348, 14);
		contentPane.add(lblNomePaciente);

		// CPF paciente
		JLabel lblCpfPaciente = new JLabel();
		lblCpfPaciente.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblCpfPaciente.setHorizontalAlignment(SwingConstants.LEFT);
		lblCpfPaciente.setBounds(92, 80, 348, 14);
		contentPane.add(lblCpfPaciente);

		// NovoRegistro
		JLabel lblNewLabel_2_1 = new JLabel("Novo registro");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_2_1.setBounds(264, 186, 64, 14);
		contentPane.add(lblNewLabel_2_1);

		// Paciente
		JLabel lblNewLabel = new JLabel("Paciente:");
		lblNewLabel.setBounds(21, 55, 64, 14);
		contentPane.add(lblNewLabel);

		// CPF
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setBounds(21, 80, 46, 14);
		contentPane.add(lblCpf);
/*
		// BUTTONS:
		// Historico
		JButton btnHistorico = new JButton("", historico);
		btnHistorico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Historico screenH = new Historico();
				screenH.setVisible(true);
				dispose();
			}
		});
		btnHistorico.setBackground(null);
		btnHistorico.setBorder(null);
		btnHistorico.setBounds(118, 121, 64, 64);
		contentPane.add(btnHistorico);

		// Registro
		JButton btnRegistro = new JButton("", registro);
		btnRegistro.setBackground(null);
		btnRegistro.setBorder(null);
		btnRegistro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Registro screenR = new Registro();
				screenR.setVisible(true);
				dispose();
			}
		});
		btnRegistro.setBounds(264, 121, 64, 64);
		contentPane.add(btnRegistro);

		// Back
		JButton btnBack = new JButton("", back);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Pesquisa screen = new Pesquisa();
				screen.setVisible(true);
				dispose();
			}
		});
		btnBack.setBackground(null);
		btnBack.setBorder(null);
		btnBack.setBounds(1, 0, 48, 48);
		contentPane.add(btnBack);
	*/

	}
	

	public Paciente(ModelPaciente paciente) {

		// WINDOW_TITLE
		setTitle("Paciente");

		// WINDOW_RESIZE:
		setResizable(false);

		// ICONS:
		ImageIcon medical = new ImageIcon("src/imgs/medicalMicro.png");
		ImageIcon historico = new ImageIcon("src/imgs/historico.png");
		ImageIcon registro = new ImageIcon("src/imgs/write.png");
		ImageIcon back = new ImageIcon("src/imgs/back.png");

		// JFRAME:
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 466, 250);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		// LABELS:
		// Title
		JLabel lblTitle = new JLabel("Acompanhamento do paciente");
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 30));
		lblTitle.setBounds(59, 11, 333, 33);
		contentPane.add(lblTitle);

		// Icon
		JLabel lblIcon = new JLabel(medical);
		lblIcon.setBounds(402, 0, 48, 48);
		contentPane.add(lblIcon);

		// Historico
		JLabel lblNewLabel_2 = new JLabel("Hist\u00F3rico");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(118, 186, 64, 14);
		contentPane.add(lblNewLabel_2);

		// Nome paciente
		JLabel lblNomePaciente = new JLabel(paciente.getNome());
		lblNomePaciente.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblNomePaciente.setBounds(92, 55, 348, 14);
		contentPane.add(lblNomePaciente);

		// CPF paciente
		JLabel lblCpfPaciente = new JLabel(paciente.getCpf());
		lblCpfPaciente.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblCpfPaciente.setBounds(92, 80, 348, 14);
		contentPane.add(lblCpfPaciente);

		// NovoRegistro
		JLabel lblNewLabel_2_1 = new JLabel("Novo registro");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_2_1.setBounds(264, 186, 64, 14);
		contentPane.add(lblNewLabel_2_1);

		// Paciente
		JLabel lblNewLabel = new JLabel("Paciente:");
		lblNewLabel.setBounds(21, 55, 64, 14);
		contentPane.add(lblNewLabel);

		// CPF
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setBounds(21, 80, 46, 14);
		contentPane.add(lblCpf);

		// BUTTONS:
		// Historico
		JButton btnHistorico = new JButton("", historico);
		btnHistorico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Historico screenH = new Historico(paciente);
				screenH.setVisible(true);
			}
		});
		btnHistorico.setBackground(null);
		btnHistorico.setBorder(null);
		btnHistorico.setBounds(118, 121, 64, 64);
		contentPane.add(btnHistorico);

		// Registro
		JButton btnRegistro = new JButton("", registro);
		btnRegistro.setBackground(null);
		btnRegistro.setBorder(null);
		btnRegistro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Registro screenR = new Registro(paciente);
				screenR.setVisible(true);
			}
		});
		btnRegistro.setBounds(264, 121, 64, 64);
		contentPane.add(btnRegistro);

		// Back
		JButton btnBack = new JButton("", back);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				People screen = new People();
				screen.setVisible(true);
				dispose();
			}
		});
		btnBack.setBackground(null);
		btnBack.setBorder(null);
		btnBack.setBounds(1, 0, 48, 48);
		contentPane.add(btnBack);

	}
}
