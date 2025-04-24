package apresentação;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import negocio.produto;
import negocio.tipo;

public class ControladorGravar implements ActionListener {

	// Método construtor cheio da classe
	public ControladorGravar(JTextField txtNome, JTextField txtPreco, JComboBox<String> cboTipo, JCheckBox chkPerecivel,
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

	public void actionPerformed(ActionEvent e) {
		// Críticas de dados
		if (txtNome.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Campo nome obrigatório !");
			return; }
			if (txtPreco.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Campo nome obrigatório !");
				return;
			}
			try {
				Double.parseDouble(txtPreco.getText());
			} catch (Exception erro) {
				JOptionPane.showMessageDialog(null, "Campo preço deve ser numérico !");
				return;
			}
			if (cboTipo.getSelectedIndex() == 0) {
				JOptionPane.showMessageDialog(null, "Campo tipo obrigatório !");
				return;
			}
			// Composição do objeto
			produto objProduto = new produto();
			objProduto.setNome(txtNome.getText());
			objProduto.setPreco(Double.parseDouble(txtPreco.getText()));
			objProduto.setObjtipo(new tipo(cboTipo.getSelectedItem().toString()));
			objProduto.setPerecivel(chkPerecivel.isSelected());
			objProduto.setDetalhamento(txtDetalhamento.getText());

			JOptionPane.showMessageDialog(null, "Gravação realizada com sucesso !");
		}

	}
