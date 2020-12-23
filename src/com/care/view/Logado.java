package com.care.view;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Logado extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Logado frame = new Logado();
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
	public Logado() {
		
		//WINDOW_TITLE:
		setTitle("Logado");
		
		//ICONS:
		ImageIcon plus = new ImageIcon("src/imgs/peoplePlus.png");
		ImageIcon people = new ImageIcon("src/imgs/people.png");
		ImageIcon medicalMicro = new ImageIcon("src/imgs/medicalMicro.png");
		ImageIcon back = new ImageIcon("src/imgs/back.png");
				
		
		//JFRAME:
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 234);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		//LABELS:
		//Welcome
		JLabel lblNewLabel = new JLabel("Bem vindo!");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 22, 414, 32);
		lblNewLabel.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 30));
		contentPane.add(lblNewLabel);
		
		//Icon
		JLabel iconFrame = new JLabel(medicalMicro);
		iconFrame.setBounds(386, 0, 48, 48);
		contentPane.add(iconFrame);
		
		//Acompanhamento
		JLabel lblNewLabel_1 = new JLabel("Acompanhamento");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_1.setBounds(239, 140, 96, 14);
		contentPane.add(lblNewLabel_1);
		
		//New
		JLabel lblNewLabel_1_1 = new JLabel("Novo paciente");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_1_1.setBounds(108, 140, 75, 14);
		contentPane.add(lblNewLabel_1_1);
		
		
		//BUTTONS:
		//Add
		JButton btnAdd = new JButton("", plus);
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PeoplePlus screen2 = new PeoplePlus();
				screen2.setVisible(true);
				dispose();
				
			}
		});
		btnAdd.setBackground(null); 
		btnAdd.setBorder(null); 
		btnAdd.setBounds(116, 65, 64, 64);
		contentPane.add(btnAdd);
		
		//Paciente
		JButton btnPeople = new JButton(people);
		btnPeople.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				People screen = new People();
				screen.setVisible(true);
				dispose();
			}
		});
		btnPeople.setBackground(null);
		btnPeople.setBorder(null);
		btnPeople.setBounds(255, 65, 64, 64);
		contentPane.add(btnPeople);
		
		
		//Back
		JButton btnNewButton = new JButton("", back);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main screen = new Main();
				screen.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBackground(null);
		btnNewButton.setBorder(null);
		btnNewButton.setBounds(10, 6, 48, 48);
		contentPane.add(btnNewButton);
	}
}
