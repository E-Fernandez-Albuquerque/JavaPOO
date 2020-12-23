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

public class Paciente extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Paciente frame = new Paciente();
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
	public Paciente() {
		
		ImageIcon medical = new ImageIcon("src/imgs/medicalMicro.png");
		ImageIcon historico = new ImageIcon("src/imgs/historico.png");
		ImageIcon registro = new ImageIcon("src/imgs/write.png");
		ImageIcon back = new ImageIcon("src/imgs/back.png");
		
		
		
		setResizable(false);
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 466, 250);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
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
		
		JLabel lblTitle = new JLabel("Acompanhamento do paciente");
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 30));
		lblTitle.setBounds(59, 11, 333, 33);
		contentPane.add(lblTitle);
		
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
		
		JLabel lblIcon = new JLabel(medical);
		lblIcon.setBounds(402, 0, 48, 48);
		contentPane.add(lblIcon);
		
		JLabel lblNewLabel_2 = new JLabel("Hist\u00F3rico");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(118, 186, 64, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Novo registro");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_2_1.setBounds(264, 186, 64, 14);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel = new JLabel("Paciente:");
		lblNewLabel.setBounds(21, 55, 64, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setBounds(21, 80, 46, 14);
		contentPane.add(lblCpf);
	}
}
