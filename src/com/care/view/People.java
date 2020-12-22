package com.care.view;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.text.ParseException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Canvas;

public class People extends JFrame {

	private JPanel contentPane;
	private JTextField txtName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					People frame = new People();
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
	public People() {
		
		//WINDOW_TITLE:
		setTitle("Pacientes");
		
		//WINDOW_RESIZE:
		setResizable(false);
		
		//ICONS:
		ImageIcon medical = new ImageIcon("src/imgs/medicalMicro.png");
		ImageIcon back = new ImageIcon("src/imgs/back.png");
		ImageIcon search = new ImageIcon("src/imgs/search.png");
		

		//JFRAME:
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 544, 194);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		//LABELS:
		//Title
		JLabel lblTitle = new JLabel("Acompanhamento de paciente");
		lblTitle.setFont(new Font("Tw Cen MT", Font.PLAIN, 30));
		lblTitle.setBounds(76, 15, 382, 30);
		contentPane.add(lblTitle);
		
		//Name
		JLabel lblName = new JLabel("Nome: ");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblName.setBounds(10, 76, 46, 14);
		contentPane.add(lblName);
		
		//CPF
		JLabel lblCPF = new JLabel("CPF:");
		lblCPF.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCPF.setBounds(10, 110, 46, 14);
		contentPane.add(lblCPF);
		
		//Icon
		JLabel lblMedical = new JLabel(medical);
		lblMedical.setBounds(468, 11, 48, 48);
		contentPane.add(lblMedical);
		
		//RG
		JLabel lblRG = new JLabel("RG:");
		lblRG.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblRG.setBounds(222, 110, 33, 14);
		contentPane.add(lblRG);
		
		//MASKS:
		//CPF
		MaskFormatter fmtCPF = null;
		try {
			fmtCPF = new MaskFormatter("###.###.###-##");
		} catch (ParseException e1) {
			e1.printStackTrace();
		}
		
		
		
		//INPUTS:
		//Name
		txtName = new JTextField();
		txtName.setBounds(66, 75, 450, 20);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		//CPF
		JFormattedTextField JFCPF = new JFormattedTextField(fmtCPF);
		JFCPF.setBounds(66, 110, 123, 20);
		contentPane.add(JFCPF);
		
		//RG
		JFormattedTextField JFRG = new JFormattedTextField();
		JFRG.setBounds(253, 110, 123, 20);
		contentPane.add(JFRG);
		
		
		//BUTTONS:
		//Search
		JButton btnSearch = new JButton("", search);
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Acompanhamento screenA = new Acompanhamento();
				screenA.setVisible(true);
				dispose();
			}
		});
		btnSearch.setBackground(null);
		btnSearch.setBorder(null);
		btnSearch.setBounds(438, 95, 48, 48);
		contentPane.add(btnSearch);
		
		//Back
		JButton btnBack = new JButton("", back);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Logado screen = new Logado();
				screen.setVisible(true);
				dispose();
			}
		});
		btnBack.setBackground(null);
		btnBack.setBorder(null);
		btnBack.setBounds(8, 8, 48, 48);
		contentPane.add(btnBack);
		

	}
}
