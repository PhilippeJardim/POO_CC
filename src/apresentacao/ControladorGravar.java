package apresentacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import negocio.Cargo;
import negocio.Colaborador;

public class ControladorGravar implements ActionListener {
	// Propriedades da Classe
	private JTextField txtNome = null;
	private JComboBox<String> cboCargo = null; 
	
	public ControladorGravar(JTextField txtNome, JComboBox<String> cboCargo) {
		super();
		this.txtNome = txtNome;
		this.cboCargo = cboCargo;
	}

	public void actionPerformed(ActionEvent e) {
		try {
			Colaborador objColaborador = new Colaborador();
			objColaborador.setNome(txtNome.getText());
			objColaborador.setObjCargo(new Cargo(cboCargo.getSelectedIndex(), "", 0));
			objColaborador.persistir();
			JOptionPane.showMessageDialog(null, "Gravação realizada com sucesso !");
		} catch (Exception erro) {
			JOptionPane.showMessageDialog(null, erro);
		}
	}
}