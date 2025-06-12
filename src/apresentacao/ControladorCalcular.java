package apresentacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

import negocio.Colaborador;

public class ControladorCalcular implements ActionListener {
		// Propriedades da classe
	private JTextArea txtFolha = null;
	
	// Método construtor cheio da classe
	public ControladorCalcular(JTextArea txtFolha) {
			super();
			this.txtFolha = txtFolha;
		}

	// Método implementado da classe
	public void actionPerformed(ActionEvent e) {
		try {
			txtFolha.setText("Nome\tSalário Bruto\tDescontos\tSalário Líquido\n" +
		"================================================\n");
			for (Colaborador objColaborador : Colaborador.getTodos()) {
				double descontos = 0;
				double salarioBruto = 0;
				double salarioLiquido = 0;
				
				salarioBruto = objColaborador.getObjCargo().getSalario();
				descontos = ((0.275 * salarioBruto) + (0.14 * salarioBruto));
				salarioLiquido = salarioBruto - descontos;
				
				txtFolha.append(objColaborador.getNome() + "\t" +
				salarioBruto + "\t" +
				descontos + "\t" +
				salarioLiquido + "\n");
				
			}
		} catch (Exception erro) {
			JOptionPane.showMessageDialog(null, erro);
		}
	}
}