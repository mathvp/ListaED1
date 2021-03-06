package exercicio3;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.Color;

public class Exercicio3View extends JFrame {

	private JPanel contentPane;

	private JTextField txtNum1;
	private JTextField txtNum2;
	private JTextField txtNum3;
	private JTextField txtNum4;
	private JTextField txtNum5;
	private JTextField txtNum6;
	private JTextField txtNum7;
	private JTextField txtNum8;
	private JTextField txtNum9;
	private JTextField txtNum10;
	private JTextField txtNum11;
	private JTextField txtNum12;
	private JTextField txtNum13;
	private JTextField txtNum14;
	private JTextField txtNum15;
	private JTextField txtNum16;
	private JButton btnGerarNumsAleatorios = new JButton("Gerar n\u00FAmeros aleat\u00F3rios");
	
	private JTextField[] campos = new JTextField[Exercicio3Model.TAM_VETOR];
	
	private JButton btnContinuar = new JButton("Continuar");
	private JButton btnLimpar = new JButton("Limpar");
	
	
	/**
	 * Create the frame.
	 */
	public Exercicio3View(Exercicio3Model model) {
		
		setTitle("Lista 1 - Estrutura de Dados - IFSP Bra");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 672, 555);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
				
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Aluno", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Informações", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JLabel lblNewLabel = new JLabel("IFSP Bragan\u00E7a Paulista - Agosto de 2018");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Exercicio 3", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 621, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, 296, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE))
						.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 626, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(panel, GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE))
					.addGap(18)
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 326, GroupLayout.PREFERRED_SIZE)
					.addGap(35)
					.addComponent(lblNewLabel)
					.addContainerGap(17, Short.MAX_VALUE))
		);
		
		JLabel lblEscrevaUm = new JLabel("<html><b>3.</b> Escreva um programa que leia um vetor de 16 posi\u00E7\u00F5es e verifique se existem valores iguais.<br>Se encontrar, escreva a lista de valores iguais.</html>");
		lblEscrevaUm.setVerticalAlignment(SwingConstants.TOP);
		lblEscrevaUm.setHorizontalAlignment(SwingConstants.LEFT);
		
		btnContinuar.setEnabled(false);
		
		JLabel label_21 = new JLabel("");
		JLabel label_22 = new JLabel("");
		JLabel label_23 = new JLabel("");					
		
		JPanel panel_3 = new JPanel();
		GridBagLayout gbl_panel_3 = new GridBagLayout();
		gbl_panel_3.columnWidths = new int[]{0, 0, 0};
		gbl_panel_3.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_panel_3.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_3.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_3.setLayout(gbl_panel_3);
		
		JLabel label_1 = new JLabel("1\u00BA n\u00FAmero:");
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.anchor = GridBagConstraints.EAST;
		gbc_label_1.insets = new Insets(0, 0, 5, 5);
		gbc_label_1.gridx = 0;
		gbc_label_1.gridy = 0;
		panel_3.add(label_1, gbc_label_1);
		
		txtNum1 = new JTextField();
		txtNum1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				validaDados();
			}
		});
		txtNum1.setColumns(4);
		GridBagConstraints gbc_txtNum1 = new GridBagConstraints();
		gbc_txtNum1.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNum1.insets = new Insets(0, 0, 5, 0);
		gbc_txtNum1.gridx = 1;
		gbc_txtNum1.gridy = 0;
		panel_3.add(txtNum1, gbc_txtNum1);
		
		JLabel label_2 = new JLabel("2\u00BA n\u00FAmero:");
		GridBagConstraints gbc_label_2 = new GridBagConstraints();
		gbc_label_2.anchor = GridBagConstraints.EAST;
		gbc_label_2.insets = new Insets(0, 0, 5, 5);
		gbc_label_2.gridx = 0;
		gbc_label_2.gridy = 1;
		panel_3.add(label_2, gbc_label_2);
		
		txtNum2 = new JTextField();
		txtNum2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				validaDados();
			}
		});
		txtNum2.setColumns(10);
		GridBagConstraints gbc_txtNum2 = new GridBagConstraints();
		gbc_txtNum2.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNum2.insets = new Insets(0, 0, 5, 0);
		gbc_txtNum2.gridx = 1;
		gbc_txtNum2.gridy = 1;
		panel_3.add(txtNum2, gbc_txtNum2);
		
		JLabel label_3 = new JLabel("3\u00BA n\u00FAmero:");
		GridBagConstraints gbc_label_3 = new GridBagConstraints();
		gbc_label_3.anchor = GridBagConstraints.EAST;
		gbc_label_3.insets = new Insets(0, 0, 5, 5);
		gbc_label_3.gridx = 0;
		gbc_label_3.gridy = 2;
		panel_3.add(label_3, gbc_label_3);
		
		txtNum3 = new JTextField();
		txtNum3.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				validaDados();
			}
		});
		txtNum3.setColumns(10);
		GridBagConstraints gbc_txtNum3 = new GridBagConstraints();
		gbc_txtNum3.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNum3.insets = new Insets(0, 0, 5, 0);
		gbc_txtNum3.gridx = 1;
		gbc_txtNum3.gridy = 2;
		panel_3.add(txtNum3, gbc_txtNum3);
		
		JLabel label_4 = new JLabel("4\u00BA n\u00FAmero:");
		GridBagConstraints gbc_label_4 = new GridBagConstraints();
		gbc_label_4.anchor = GridBagConstraints.EAST;
		gbc_label_4.insets = new Insets(0, 0, 5, 5);
		gbc_label_4.gridx = 0;
		gbc_label_4.gridy = 3;
		panel_3.add(label_4, gbc_label_4);
		
		txtNum4 = new JTextField();
		txtNum4.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				validaDados();
			}
		});
		txtNum4.setColumns(10);
		GridBagConstraints gbc_txtNum4 = new GridBagConstraints();
		gbc_txtNum4.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNum4.insets = new Insets(0, 0, 5, 0);
		gbc_txtNum4.gridx = 1;
		gbc_txtNum4.gridy = 3;
		panel_3.add(txtNum4, gbc_txtNum4);
		
		JLabel label_5 = new JLabel("5\u00BA n\u00FAmero:");
		GridBagConstraints gbc_label_5 = new GridBagConstraints();
		gbc_label_5.anchor = GridBagConstraints.EAST;
		gbc_label_5.insets = new Insets(0, 0, 0, 5);
		gbc_label_5.gridx = 0;
		gbc_label_5.gridy = 4;
		panel_3.add(label_5, gbc_label_5);
		
		txtNum5 = new JTextField();
		txtNum5.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				validaDados();
			}
		});
		txtNum5.setColumns(10);
		GridBagConstraints gbc_txtNum5 = new GridBagConstraints();
		gbc_txtNum5.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNum5.gridx = 1;
		gbc_txtNum5.gridy = 4;
		panel_3.add(txtNum5, gbc_txtNum5);
		
		JPanel panel_4 = new JPanel();
		GridBagLayout gbl_panel_4 = new GridBagLayout();
		gbl_panel_4.columnWidths = new int[]{0, 0, 0};
		gbl_panel_4.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_panel_4.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_4.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_4.setLayout(gbl_panel_4);
		
		JLabel label_6 = new JLabel("6\u00BA n\u00FAmero:");
		GridBagConstraints gbc_label_6 = new GridBagConstraints();
		gbc_label_6.anchor = GridBagConstraints.EAST;
		gbc_label_6.insets = new Insets(0, 0, 5, 5);
		gbc_label_6.gridx = 0;
		gbc_label_6.gridy = 0;
		panel_4.add(label_6, gbc_label_6);
		
		txtNum6 = new JTextField();
		txtNum6.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				validaDados();
			}
		});
		txtNum6.setColumns(4);
		GridBagConstraints gbc_txtNum6 = new GridBagConstraints();
		gbc_txtNum6.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNum6.insets = new Insets(0, 0, 5, 0);
		gbc_txtNum6.gridx = 1;
		gbc_txtNum6.gridy = 0;
		panel_4.add(txtNum6, gbc_txtNum6);
		
		JLabel label_7 = new JLabel("7\u00BA n\u00FAmero:");
		GridBagConstraints gbc_label_7 = new GridBagConstraints();
		gbc_label_7.anchor = GridBagConstraints.EAST;
		gbc_label_7.insets = new Insets(0, 0, 5, 5);
		gbc_label_7.gridx = 0;
		gbc_label_7.gridy = 1;
		panel_4.add(label_7, gbc_label_7);
		
		txtNum7 = new JTextField();
		txtNum7.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				validaDados();
			}
		});
		txtNum7.setColumns(10);
		GridBagConstraints gbc_txtNum7 = new GridBagConstraints();
		gbc_txtNum7.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNum7.insets = new Insets(0, 0, 5, 0);
		gbc_txtNum7.gridx = 1;
		gbc_txtNum7.gridy = 1;
		panel_4.add(txtNum7, gbc_txtNum7);
		
		JLabel label_8 = new JLabel("8\u00BA n\u00FAmero:");
		GridBagConstraints gbc_label_8 = new GridBagConstraints();
		gbc_label_8.anchor = GridBagConstraints.EAST;
		gbc_label_8.insets = new Insets(0, 0, 5, 5);
		gbc_label_8.gridx = 0;
		gbc_label_8.gridy = 2;
		panel_4.add(label_8, gbc_label_8);
		
		txtNum8 = new JTextField();
		txtNum8.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				validaDados();
			}
		});
		txtNum8.setColumns(10);
		GridBagConstraints gbc_txtNum8 = new GridBagConstraints();
		gbc_txtNum8.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNum8.insets = new Insets(0, 0, 5, 0);
		gbc_txtNum8.gridx = 1;
		gbc_txtNum8.gridy = 2;
		panel_4.add(txtNum8, gbc_txtNum8);
		
		JLabel label_9 = new JLabel("9\u00BA n\u00FAmero:");
		GridBagConstraints gbc_label_9 = new GridBagConstraints();
		gbc_label_9.anchor = GridBagConstraints.EAST;
		gbc_label_9.insets = new Insets(0, 0, 5, 5);
		gbc_label_9.gridx = 0;
		gbc_label_9.gridy = 3;
		panel_4.add(label_9, gbc_label_9);
		
		txtNum9 = new JTextField();
		txtNum9.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				validaDados();
			}
		});
		txtNum9.setColumns(10);
		GridBagConstraints gbc_txtNum9 = new GridBagConstraints();
		gbc_txtNum9.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNum9.insets = new Insets(0, 0, 5, 0);
		gbc_txtNum9.gridx = 1;
		gbc_txtNum9.gridy = 3;
		panel_4.add(txtNum9, gbc_txtNum9);
		
		JLabel label_10 = new JLabel("10\u00BA n\u00FAmero:");
		GridBagConstraints gbc_label_10 = new GridBagConstraints();
		gbc_label_10.anchor = GridBagConstraints.EAST;
		gbc_label_10.insets = new Insets(0, 0, 0, 5);
		gbc_label_10.gridx = 0;
		gbc_label_10.gridy = 4;
		panel_4.add(label_10, gbc_label_10);
		
		txtNum10 = new JTextField();
		txtNum10.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				validaDados();
			}
		});
		txtNum10.setColumns(10);
		GridBagConstraints gbc_txtNum10 = new GridBagConstraints();
		gbc_txtNum10.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNum10.gridx = 1;
		gbc_txtNum10.gridy = 4;
		panel_4.add(txtNum10, gbc_txtNum10);
		
		JLabel label_26 = new JLabel("");
		
		JLabel label_27 = new JLabel("");
		
		JPanel panel_5 = new JPanel();
		GridBagLayout gbl_panel_5 = new GridBagLayout();
		gbl_panel_5.columnWidths = new int[]{0, 0, 0};
		gbl_panel_5.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_panel_5.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_5.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_5.setLayout(gbl_panel_5);
		
		JLabel label = new JLabel("11\u00BA n\u00FAmero:");
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.anchor = GridBagConstraints.EAST;
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 0;
		gbc_label.gridy = 0;
		panel_5.add(label, gbc_label);
		
		txtNum11 = new JTextField();
		txtNum11.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				validaDados();
			}
		});
		txtNum11.setColumns(4);
		GridBagConstraints gbc_txtNum11 = new GridBagConstraints();
		gbc_txtNum11.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNum11.insets = new Insets(0, 0, 5, 0);
		gbc_txtNum11.gridx = 1;
		gbc_txtNum11.gridy = 0;
		panel_5.add(txtNum11, gbc_txtNum11);
		
		JLabel label_11 = new JLabel("12\u00BA n\u00FAmero:");
		GridBagConstraints gbc_label_11 = new GridBagConstraints();
		gbc_label_11.anchor = GridBagConstraints.EAST;
		gbc_label_11.insets = new Insets(0, 0, 5, 5);
		gbc_label_11.gridx = 0;
		gbc_label_11.gridy = 1;
		panel_5.add(label_11, gbc_label_11);
		
		txtNum12 = new JTextField();
		txtNum12.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				validaDados();
			}
		});
		txtNum12.setColumns(10);
		GridBagConstraints gbc_txtNum12 = new GridBagConstraints();
		gbc_txtNum12.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNum12.insets = new Insets(0, 0, 5, 0);
		gbc_txtNum12.gridx = 1;
		gbc_txtNum12.gridy = 1;
		panel_5.add(txtNum12, gbc_txtNum12);
		
		JLabel label_12 = new JLabel("13\u00BA n\u00FAmero:");
		GridBagConstraints gbc_label_12 = new GridBagConstraints();
		gbc_label_12.anchor = GridBagConstraints.EAST;
		gbc_label_12.insets = new Insets(0, 0, 5, 5);
		gbc_label_12.gridx = 0;
		gbc_label_12.gridy = 2;
		panel_5.add(label_12, gbc_label_12);
		
		txtNum13 = new JTextField();
		txtNum13.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				validaDados();
			}
		});
		txtNum13.setColumns(10);
		GridBagConstraints gbc_txtNum13 = new GridBagConstraints();
		gbc_txtNum13.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNum13.insets = new Insets(0, 0, 5, 0);
		gbc_txtNum13.gridx = 1;
		gbc_txtNum13.gridy = 2;
		panel_5.add(txtNum13, gbc_txtNum13);
		
		JLabel label_13 = new JLabel("14\u00BA n\u00FAmero:");
		GridBagConstraints gbc_label_13 = new GridBagConstraints();
		gbc_label_13.anchor = GridBagConstraints.EAST;
		gbc_label_13.insets = new Insets(0, 0, 5, 5);
		gbc_label_13.gridx = 0;
		gbc_label_13.gridy = 3;
		panel_5.add(label_13, gbc_label_13);
		
		txtNum14 = new JTextField();
		txtNum14.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				validaDados();
			}
		});
		txtNum14.setColumns(10);
		GridBagConstraints gbc_txtNum14 = new GridBagConstraints();
		gbc_txtNum14.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNum14.insets = new Insets(0, 0, 5, 0);
		gbc_txtNum14.gridx = 1;
		gbc_txtNum14.gridy = 3;
		panel_5.add(txtNum14, gbc_txtNum14);
		
		JLabel label_14 = new JLabel("15\u00BA n\u00FAmero:");
		GridBagConstraints gbc_label_14 = new GridBagConstraints();
		gbc_label_14.anchor = GridBagConstraints.EAST;
		gbc_label_14.insets = new Insets(0, 0, 0, 5);
		gbc_label_14.gridx = 0;
		gbc_label_14.gridy = 4;
		panel_5.add(label_14, gbc_label_14);
		
		txtNum15 = new JTextField();
		txtNum15.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				validaDados();
			}
		});
		txtNum15.setColumns(10);
		GridBagConstraints gbc_txtNum15 = new GridBagConstraints();
		gbc_txtNum15.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNum15.gridx = 1;
		gbc_txtNum15.gridy = 4;
		panel_5.add(txtNum15, gbc_txtNum15);
		
		JPanel panel_6 = new JPanel();
		panel_6.setLayout(null);
		
		JLabel lblNmero = new JLabel("16\u00BA n\u00FAmero:");
		lblNmero.setBounds(0, 0, 60, 22);
		panel_6.add(lblNmero);
		
		txtNum16 = new JTextField();
		txtNum16.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				validaDados();
			}
		});
		txtNum16.setBounds(65, 0, 61, 22);
		txtNum16.setColumns(4);
		panel_6.add(txtNum16);
		
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblEscrevaUm, GroupLayout.DEFAULT_SIZE, 607, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(label_21)
					.addGap(5)
					.addComponent(label_22)
					.addGap(5)
					.addComponent(label_23))
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnGerarNumsAleatorios)
					.addGap(18)
					.addComponent(btnLimpar)
					.addContainerGap(389, Short.MAX_VALUE))
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(388)
					.addComponent(label_26)
					.addGap(161)
					.addComponent(label_27)
					.addGap(84))
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(236)
					.addComponent(btnContinuar, GroupLayout.PREFERRED_SIZE, 148, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(249, Short.MAX_VALUE))
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)
					.addGap(27)
					.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(panel_5, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
					.addComponent(panel_6, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
					.addGap(34))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addGap(26)
							.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
								.addComponent(label_22)
								.addComponent(label_23)
								.addComponent(label_21)))
						.addGroup(gl_panel_2.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblEscrevaUm)))
					.addGap(18)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnGerarNumsAleatorios)
								.addComponent(btnLimpar))
							.addGap(18)
							.addGroup(gl_panel_2.createParallelGroup(Alignment.TRAILING)
								.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addComponent(panel_5, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_6, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(btnContinuar, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
					.addGap(32)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addComponent(label_26)
						.addComponent(label_27))
					.addContainerGap())
		);
		panel_2.setLayout(gl_panel_2);
		
		JLabel lblEstruturaDeDados = new JLabel("Disciplina: Estrutura de Dados I - EDI");
		
		JLabel lblProfessorLuizAlbano = new JLabel("Professor: Luiz Roberto Albano");
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(lblEstruturaDeDados)
						.addComponent(lblProfessorLuizAlbano))
					.addContainerGap(137, Short.MAX_VALUE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblEstruturaDeDados)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblProfessorLuizAlbano)
					.addContainerGap(18, Short.MAX_VALUE))
		);
		panel_1.setLayout(gl_panel_1);
		
		JLabel lblNomeMatheusVieira = new JLabel("Nome: Matheus Vieira de Paula");
		
		JLabel lblPronturioBp = new JLabel("Prontu\u00E1rio: BP300132-6");
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNomeMatheusVieira)
						.addComponent(lblPronturioBp))
					.addContainerGap(126, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNomeMatheusVieira)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblPronturioBp)
					.addContainerGap(50, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);
		
		
		campos[0] = txtNum1;
	    campos[1] = txtNum2;
	    campos[2] = txtNum3;
	    campos[3] = txtNum4;
	    campos[4] = txtNum5;
	    campos[5] = txtNum6;
	    campos[6] = txtNum7;
	    campos[7] = txtNum8;
	    campos[8] = txtNum9;
	    campos[9] = txtNum10;
	    campos[10] = txtNum11;
	    campos[11] = txtNum12;
	    campos[12] = txtNum13;
	    campos[13] = txtNum14;
	    campos[14] = txtNum15;
	    campos[15] = txtNum16;
	}
	
	void validaDados() {
		int erros = 0;
		for(int i=0; i<Exercicio3Model.TAM_VETOR; i++) {
			try {
				Integer.parseInt(campos[i].getText());
				
			}catch(Exception e) {
				erros++;
			}
						
		}
		
		if(erros == 0) {
			btnContinuar.setEnabled(true);
		}else {
			btnContinuar.setEnabled(false);
		}
		
	}
	
	void setAllInputs(int[] valores) {
		for(int i=0; i<Exercicio3Model.TAM_VETOR; i++) {
			campos[i].setText(Integer.toString(valores[i]));
		}
		validaDados();
	}
	
	public int[] getAllInputsVal() {
		int[] valores = new int[Exercicio3Model.TAM_VETOR];
		
		for(int i=0; i<Exercicio3Model.TAM_VETOR; i++) {
			valores[i] = Integer.parseInt(campos[i].getText());
		}
		
		return valores;
	}
	
	void limparCampos() {
		for(int i=0; i<Exercicio3Model.TAM_VETOR; i++) {
			campos[i].setText("");
		}
		btnContinuar.setEnabled(false);
	}
		
	void addNumAleatorioListener(ActionListener act) {
		btnGerarNumsAleatorios.addActionListener(act);		
	}
	
	void addContinuarListener(ActionListener act) {
		btnContinuar.addActionListener(act);		
	}	
	
	void addLimparListener(ActionListener act) {
		btnLimpar.addActionListener(act);
	}
	
	void exibirMsg(String msg) {
		JOptionPane.showMessageDialog(null, msg);
	}
		
}

