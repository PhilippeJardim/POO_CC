package apresentacao;

import javax.swing.JFrame;
import javax.swing.JPanel;

	// PASSO 1
public class Visao extends JFrame {
	// propriedades da classe - PASSO 2
	private static final long serialVersionUID = 1L;
	
	private JPanel objPainel = new Painel();
	
	// PASSO 3 cadastrar os controles da tela
	
	// Método principal de execução do programa - PASSO 4
	public static void main(String[] args) {
		new Visao().setVisible(true);
	}
	
	// método construtor da classe
	public Visao() {
		// config da janela - PASSO 5
		setTitle("Minha primeira janela JAVA !!!");
		setSize(1024,768);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		// config do painel
		setContentPane(objPainel);
		
	}
}
