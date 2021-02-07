package com.care.view;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.care.model.ModelPaciente;
import com.care.model.ModelTabela;
import javax.swing.JScrollPane;

public class Historico extends JFrame {

	private JPanel contentPane;
	private JTable table;
	DefaultTableModel modeloTabela = new DefaultTableModel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				/*
				try {
					Historico frame = new Historico(paciente);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
				*/
			}
		});
	}

	/**
	 * Create the frame.
	 */
	
	
	public Historico(ModelPaciente paciente) {
		
		
		//WINDOW_TITLE
		setTitle("Histórico");
		
		//ICONS:
		ImageIcon back = new ImageIcon("src/imgs/back.png");
		ImageIcon medical = new ImageIcon("src/imgs/medicalMicro.png");
		
		//JFRAME:
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(150, 150, 500, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		
		//LABELS:
		//Label Title
		JLabel lblTitle = new JLabel("Hist\u00F3rico de paciente");
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 30));
		
		//Label Icon
		JLabel lblIcon = new JLabel(medical);
		
		//Label Paciente
		JLabel lblNewLabel = new JLabel("Paciente:");
		
		//Label CPF
		JLabel lblCpf = new JLabel("CPF:");
		
		//Label nome do paciente
		JLabel lblNomePaciente = new JLabel(paciente.getNome());
		lblNomePaciente.setFont(new Font("Tahoma", Font.PLAIN, 9));
		
		//Label cpf do paciente
		JLabel lblCpfPaciente = new JLabel(paciente.getCpf());
		lblCpfPaciente.setFont(new Font("Tahoma", Font.PLAIN, 9));
		
		JScrollPane scrollPane = new JScrollPane();
		
		
		
		
		//GROUPLAYOUT CONFIG
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
							.addContainerGap())
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel)
								.addComponent(lblCpf, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(8)
									.addComponent(lblTitle, GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
									.addGap(52)
									.addComponent(lblIcon, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(10)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(lblNomePaciente, GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
											.addGap(52))
										.addComponent(lblCpfPaciente, GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE))))
							.addGap(8))))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblIcon, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblTitle, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
							.addGap(4)
							.addComponent(lblNomePaciente, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblNewLabel))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCpf)
						.addComponent(lblCpfPaciente, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
					.addGap(37)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		table = new JTable(modeloTabela);
		scrollPane.setViewportView(table);
		contentPane.setLayout(gl_contentPane);
		
		modeloTabela.addColumn("Data");
		modeloTabela.addColumn("Especialidade Médica");
		modeloTabela.addColumn("Observações");
		
		ModelTabela tabela = new ModelTabela();
		tabela.retornaHistorico(paciente);
		int c = 0;
		for(String dt : tabela.getData()) {
			modeloTabela.addRow(new Object[] {tabela.getData().get(c), tabela.getEspecialidade().get(c), tabela.getObservacoes().get(c)});
			c++;
		}
	}
}
