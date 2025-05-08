package APRESENTAÇÃO;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import NEGÓCIO.FABRICANTE;
import NEGÓCIO.VEICULO;

public class ControladorGravar implements ActionListener {
	// Propriedades da classe
		private JComboBox<String> cboFABRICANTE = null;
		private JTextField txtMODELO = null;
		private JComboBox<String> cboCOR = null;
		private JCheckBox chkTetoSolar = null;
		
		// Método construtor cheio da classe
	public ControladorGravar(JComboBox<String> cboFABRICANTE, JTextField txtMODELO, JComboBox<String> cboCOR,
				JCheckBox chkTetoSolar) {
			super();
			this.cboFABRICANTE = cboFABRICANTE;
			this.txtMODELO = txtMODELO;
			this.cboCOR = cboCOR;
			this.chkTetoSolar = chkTetoSolar;
		}

	// Método implementado da interface
	public void actionPerformed(ActionEvent e) {
		//Crítica de dados
		if (cboFABRICANTE.getSelectedIndex() == 0) {
			JOptionPane.showMessageDialog(null,  "Campo fabricante obrigatório !");
			return;
		}
		if (txtMODELO.getText().equals("")) {
			JOptionPane.showMessageDialog(null,  "Campo modelo obrigatório !");
			return;
		}
		if (cboCOR.getSelectedIndex() == 0) {
			JOptionPane.showMessageDialog(null,  "Campo cor obrigatório !");
			return;
	}

	// Composição do objeto
		VEICULO objVEICULO = new VEICULO();
		objVEICULO.setObjFABRICANTE(new FABRICANTE(cboFABRICANTE.getSelectedItem().toString()));
		objVEICULO.setModelo(txtMODELO.getText());
		objVEICULO.setCor(cboCOR.getSelectedItem().toString());
		objVEICULO.setTetoSolar(chkTetoSolar.isSelected());
		
		JOptionPane.showMessageDialog(null,  "Gravavação realizada com sucesso !\n\n" +
		"FABRICANTE: " + objVEICULO.getObjFABRICANTE().getNome() + "\n" +
		"MODELO: " + objVEICULO.getModelo() + "\n" +
		"COR: " + objVEICULO.getCor() + "\n" +
		"Teto Solar: " + (objVEICULO.isTetoSolar() ? "SIM" : "NÃO"));
}
}