package apresentacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ControladorLimpar implements ActionListener {
	// Propriedades da classe
	private JTextField txtNome = null;
	private JComboBox<String> cboCargo = null;
	private JTextArea txtFolha = null;
	
	// Método implementado da interface
	public void actionPerformed(ActionEvent e) {
		txtNome.setText("");
		cboCargo.setSelectedIndex(0);
		txtFolha.setText("");
		}

	// Método construtor cheio da classe 
	public ControladorLimpar(JTextField txtNome, JComboBox<String> cboCargo, JTextArea txtFolha) {
		super();
		this.txtNome = txtNome;
		this.cboCargo = cboCargo;
		this.txtFolha = txtFolha;
	}
}