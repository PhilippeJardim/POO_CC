package APRESENTAÇÃO;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import NEGÓCIO.FABRICANTE;

public class VISAOVEICULO extends JFrame {
	//Propriedades da classe
	private static final long serialVersionUID = 1L;
	
	private JLabel lblFABRICANTE = new JLabel("FABRICANTE");
	private JComboBox<String> cboFABRICANTE = new JComboBox<String>();
	
	private JLabel lblMODELO = new JLabel("MODELO");
	private JTextField txtMODELO = new JTextField();
	
	private JLabel lblCOR = new JLabel("COR");
	private JComboBox<String> cboCOR = new JComboBox<String>();

	private JCheckBox chkTetoSolar = new JCheckBox("Teto Solar");
	
	private JButton btnGravar = new JButton("Gravar");
	private JButton btnLimpar = new JButton("Limpar");
	private JButton btnSair = new JButton("Sair");
	
	// Método principal de execução da classe
	public static void main(String[] args) {
		new VISAOVEICULO().setVisible(true);
	}
	
	// Método construtor da classe
	public VISAOVEICULO() {
		// Configuração da Janela
		setTitle("Cadastro de Veículos");
		setSize(300, 260);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(null);
		
		// Configuração da caixa de seleçao do fabricante
		lblFABRICANTE.setBounds(10, 10, 200, 20);
		add(lblFABRICANTE);
		cboFABRICANTE.setBounds(10, 30, 265, 20);
		add(cboFABRICANTE);
		cboFABRICANTE.addItem("---FABRICANTE---");
		try {
			for (FABRICANTE objFABRICANTE : FABRICANTE.getTodos()) {
				cboFABRICANTE.addItem(objFABRICANTE.getNome());
			}
			} catch (Exception erro) {
				JOptionPane.showMessageDialog(null, erro);
		}
		
		// Configuração da caixa de modelo
		lblMODELO.setBounds(10, 60, 200, 20);
		add(lblMODELO);
		txtMODELO.setBounds(10, 80, 265, 20);
		add(txtMODELO);
		
		// Configuração da caixa de seleção da cor
		lblCOR.setBounds(10, 110, 200, 20);
		add(lblCOR);
		cboCOR.setBounds(10, 130, 150, 20);
		add(cboCOR);
		cboCOR.addItem("---COR---");
		cboCOR.addItem("Branco");
		cboCOR.addItem("Prata");
		cboCOR.addItem("Amarelo");
		cboCOR.addItem("Vermelho");
		cboCOR.addItem("Preto");
		
		// Configuração da caixa de opção do teto solar
		chkTetoSolar.setBounds(6, 160, 200, 20);
		add(chkTetoSolar);
		
		// Configuração dos botões
		btnGravar.setBounds(10, 190, 80, 20);
		add(btnGravar);
		btnGravar.addActionListener(new ControladorGravar(
				cboFABRICANTE, txtMODELO, cboCOR, chkTetoSolar));
		
		btnLimpar.setBounds(102, 190, 80, 20);
		add(btnLimpar);
		btnLimpar.addActionListener(new ControladorLimpar(
				cboFABRICANTE, txtMODELO, cboCOR, chkTetoSolar));
		
		btnSair.setBounds(194, 190, 80, 20);
		add(btnSair);
		btnSair.addActionListener(new ControladorSair());
	}
}
