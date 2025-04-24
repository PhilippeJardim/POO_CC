package apresentação;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ControladorLimpar implements ActionListener {
	// Método construtor cheio da classe
	public ControladorLimpar(JTextField txtNome, JTextField txtPreco, JComboBox<String> cboTipo, JCheckBox chkPerecivel,
			JTextArea txtDetalhamento) {
		super();
		this.txtNome = txtNome;
		this.txtPreco = txtPreco;
		this.cboTipo = cboTipo;
		this.chkPerecivel = chkPerecivel;
		this.txtDetalhamento = txtDetalhamento;
	}
	// Propriedades da classe
	private JTextField txtNome = null;
	private JTextField txtPreco = null;
	private JComboBox<String> cboTipo = null;
	private JCheckBox chkPerecivel = null;
	private JTextArea txtDetalhamento = null;
	
	// Método implementado da interface
	public void actionPerformed(ActionEvent e) {
		txtNome.setText("");
		txtPreco.setText("");
		cboTipo.setSelectedIndex(0);
		chkPerecivel.setSelected(false);
		txtDetalhamento.setText("");
}

}
