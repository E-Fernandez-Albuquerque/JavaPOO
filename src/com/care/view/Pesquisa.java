package com.care.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.GroupLayout.Alignment;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.Icon;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTable;

public class Pesquisa extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pesquisa frame = new Pesquisa();
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
	public Pesquisa() {
		
		
		//JFRAME
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 558, 313);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		
		//ICONS:
		ImageIcon back = new ImageIcon("src/imgs/back.png");
		ImageIcon medical = new ImageIcon("src/imgs/medicalMicro.png");
		
		
		//LABELS:
		//Title
		JLabel lblTitle = new JLabel("Resultados de pesquisa");
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(new Font("Tw Cen MT", Font.PLAIN, 30));
		
		//Icon
		JLabel lblIcon = new JLabel(medical);
		
		//Seleção
		JLabel lblNewLabel = new JLabel("Selecione o paciente em consulta:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		
		//BUTTONS:
		//Back
		JButton btnBack = new JButton("", back);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				People screen = new People();
				screen.setVisible(true);
				dispose();
			}
		});
		btnBack.setBorder(null);
		btnBack.setBackground(null);
		
		//Select
		JButton btnNewButton = new JButton("Escolher paciente");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Paciente screen = new Paciente();
				screen.setVisible(true);
				dispose();
			}
		});
		
		
		//TABLE:
		table = new JTable();
		
		
		//GROUPLAYOUT CONFIG
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_contentPane.createSequentialGroup()
								.addComponent(table, GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE)
								.addContainerGap())
							.addGroup(gl_contentPane.createSequentialGroup()
								.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
									.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
										.addComponent(btnBack, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.UNRELATED)
										.addComponent(lblTitle, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
									.addComponent(lblNewLabel, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 231, GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(lblIcon, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)))
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addComponent(btnNewButton)
							.addContainerGap())))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblIcon, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(btnBack, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblTitle))
							.addGap(18)
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(table, GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnNewButton)
					.addGap(7))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
