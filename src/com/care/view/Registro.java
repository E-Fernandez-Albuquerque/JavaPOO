package com.care.view;

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
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

public class Registro extends JFrame {

	private JPanel contentPane;
	private JTextField txtEspecialidade;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registro frame = new Registro();
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
	public Registro() {
		ImageIcon back = new ImageIcon("src/imgs/back.png");
		ImageIcon medical = new ImageIcon("src/imgs/medicalMicro.png");
		ImageIcon check = new ImageIcon("src/imgs/check.png");
		
		
		MaskFormatter fmtDataMask = null;
		try {
			fmtDataMask = new MaskFormatter("##/##/####");
		} catch (ParseException e1) {
			e1.printStackTrace();
		}
		
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 562, 484);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitle = new JLabel("Novo registro m\u00E9dico");
		lblTitle.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 30));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setBounds(66, 8, 411, 40);
		contentPane.add(lblTitle);
		
		JLabel lblPaciente = new JLabel("Paciente:");
		lblPaciente.setBounds(10, 82, 63, 14);
		contentPane.add(lblPaciente);
		
		JLabel lblCPF = new JLabel("CPF:");
		lblCPF.setBounds(10, 99, 46, 14);
		contentPane.add(lblCPF);
		
		JLabel lblData = new JLabel("Data:");
		lblData.setBounds(10, 159, 46, 14);
		contentPane.add(lblData);
		
		JLabel lblEspecialidade = new JLabel("Especialidade m\u00E9dica:");
		lblEspecialidade.setBounds(10, 180, 135, 20);
		contentPane.add(lblEspecialidade);
		
		JLabel lblObs = new JLabel("Observa\u00E7\u00F5es:");
		lblObs.setBounds(10, 209, 103, 14);
		contentPane.add(lblObs);
		
		JTextArea txtObs = new JTextArea();
		txtObs.setBounds(10, 230, 523, 134);
		contentPane.add(txtObs);
		
		JFormattedTextField ftmData = new JFormattedTextField(fmtDataMask);
		ftmData.setBounds(155, 156, 154, 20);
		contentPane.add(ftmData);
		
		JButton btnBack = new JButton("", back);
		btnBack.setBackground(null);
		btnBack.setBorder(null);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Paciente screen = new Paciente();
				screen.setVisible(true);
				dispose();
			}
		});
		btnBack.setBounds(8, 8, 48, 48);
		contentPane.add(btnBack);
		
		JLabel lblIcon = new JLabel(medical);
		lblIcon.setBounds(498, 8, 48, 48);
		contentPane.add(lblIcon);
		
		JButton btnSave = new JButton("", check);
		btnSave.setBackground(null);
		btnSave.setBorder(null);
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Informações registradas com sucesso");
			}
		});
		btnSave.setBounds(487, 375, 48, 48);
		contentPane.add(btnSave);
		
		JLabel lblSave = new JLabel("Salvar");
		lblSave.setFont(new Font("Tw Cen MT", Font.PLAIN, 11));
		lblSave.setHorizontalAlignment(SwingConstants.CENTER);
		lblSave.setBounds(487, 423, 46, 14);
		contentPane.add(lblSave);
		
		txtEspecialidade = new JTextField();
		txtEspecialidade.setBounds(155, 181, 154, 20);
		contentPane.add(txtEspecialidade);
		txtEspecialidade.setColumns(10);
	}
}
