package apresentacao;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import negocio.Cargo;

public class Visao extends JFrame {
	// Propriedades da classe
	private static final long serialVersionUID = 1L;
	
	private JLabel lblNome = new JLabel("Nome");
	private JTextField txtNome = new JTextField();
	
	private JLabel lblCargo = new JLabel("Cargo");
	private JComboBox<String> cboCargo = new JComboBox<String>();
	
	private JLabel lblFolha = new JLabel("Folha de Pagamento");
	private JTextArea txtFolha = new JTextArea();
	private JScrollPane jspFolha = new JScrollPane(txtFolha);
	
	private JButton btnCalcular = new JButton("Calcular");
	private JButton btnGravar = new JButton("Gravar");
	private JButton btnLimpar = new JButton("Limpar");
	private JButton btnSair = new JButton("Sair");

	// Método principal de execução da classe
	public static void main(String [] args) {
		new Visao().setVisible(true);
	}
	
	// Método construtor da classe
	public Visao() {
		// Config da janela
		setTitle("Cadastro de Colaboradores e Cálculo da Folha de Pagamento");
		setSize(800, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(null);
		
		// COnfig da caixa do nome
		lblNome.setBounds(10, 10, 200, 20);
		add(lblNome);
		txtNome.setBounds(10, 30, 400, 20);
		add(txtNome);
		
		//Config da combo de cargos
		lblCargo.setBounds(10, 60, 200, 20);
		add(lblCargo);
		cboCargo.setBounds(10, 80, 400, 20);
		add(cboCargo);
		cboCargo.addItem("--- Selecione o Cargo ---");
		try {
			for (Cargo objCargo : Cargo.getTodos()) {
				cboCargo.addItem(objCargo.getNome());
			}
			
		} catch (Exception erro) {
			JOptionPane.showMessageDialog(null, erro);
		}
		
		// Config da área da folha
		lblFolha.setBounds(10, 110, 200, 20);
		add(lblFolha);
		jspFolha.setBounds(10, 130, 765, 380);
		add(jspFolha);
		txtFolha.setLineWrap(true);
		
		// Config dos botões
		btnCalcular.setBounds(170, 520, 100, 30);
		add(btnCalcular);
		btnCalcular.addActionListener(new ControladorCalcular(txtFolha));
		
		btnGravar.setBounds(290, 520, 100, 30);
		add(btnGravar);
		btnGravar.addActionListener(new ControladorGravar(txtNome, cboCargo));
		
		btnLimpar.setBounds(410, 520, 100, 30);
		add(btnLimpar);
		btnLimpar.addActionListener(new ControladorLimpar(txtNome, cboCargo, txtFolha));
		
		btnSair.setBounds(530, 520, 100, 30);
		add(btnSair);
		btnSair.addActionListener(new ControladorSair());
	}
}