package APRESENTAÇÃO;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JTextField;

public class ControladorLimpar implements ActionListener {
	// Propriedades da classe
	private JComboBox<String> cboFABRICANTE = null;
	private JTextField txtMODELO = null;
	private JComboBox<String> cboCOR = null;
	private JCheckBox chkTetoSolar = null;
	
	// Método construtor cheio da classe
	public ControladorLimpar(JComboBox<String> cboFABRICANTE, JTextField txtMODELO, JComboBox<String> cboFCOR,
			JCheckBox chkTetoSolar) {
		super();
		this.cboFABRICANTE = cboFABRICANTE;
		this.txtMODELO = txtMODELO;
		this.cboCOR = cboFCOR;
		this.chkTetoSolar = chkTetoSolar;
	}


	
	// Método implementado da interface
	public void actionPerformed(ActionEvent e) {
		cboFABRICANTE.setSelectedIndex(0);
		txtMODELO.setText("");
		cboCOR.setSelectedIndex(0);
		chkTetoSolar.setSelected(false);

	}

}
