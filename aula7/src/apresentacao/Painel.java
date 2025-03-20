package apresentacao;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Painel extends JPanel {
	private static final long serialVersionUID = 1L;
	
	public void paintComponent(Graphics g) {
		// céu
		g.setColor(Color.cyan);
		g.fillRect(0, 0, 1024, 500);
		
		// chão
		g.setColor(Color.green);
		g.fillRect(0, 500, 1024, 768);
		
		// SOL
		g.setColor(Color.orange);
		g.fillOval(850, 50, 120, 120);
		g.setColor(Color.yellow);
		g.fillOval(870, 70, 80, 80);
		
		// FRENTE CASA
		g.setColor(Color.black);
		g.drawRect(100, 580, 50, 100);
		
		//TELHADO DA FRENTE DA CASA
		g.drawLine(100, 580, 125, 530);
		g.drawLine(150, 580, 125, 530);
		
		//LATERAL DA CASA
		g.drawLine(150, 680, 300, 630);
		g.drawLine(300, 530, 300, 630);
		g.drawLine(150, 580, 300, 530);
		
		//TELHADO LATERAL
		g.drawLine(300, 530, 270, 490);
		g.drawLine(125, 530, 270, 490);
		
		//BONECO CABEÇUDO
		g.setColor(Color.red);
		g.fillOval(650, 600, 20, 20);
		
		//TRONCO
		g.drawLine(660, 620, 660, 670);

		//BRAÇO
		g.drawLine(630, 630, 690, 630);
		
		//PERNA ESQUERDA
		g.drawLine(660, 670, 630, 700);
		
		//PERNA DIREITA
		g.drawLine(660, 670, 690, 700);


		

		
}
}