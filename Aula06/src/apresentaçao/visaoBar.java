package apresentaçao;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import negocio.MIXER;
import negocio.caipirinha;
import negocio.drink;
import negocio.dryMartini;
import negocio.moscowMule;
import negocio.oldFashion;

public class visaoBar {
	public static void main(String[] args) {
		//Declaracao de variaveis
		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
		drink objDrink = null;
		int opcao = 0;
		
		// Entrada de dados
		try {
			
			
			System.out.println("Chega de beber ! Va pra casa!");
			System.out.println("+=========+");
			System.out.println("|    Cardapio      |");
			System.out.println("| 1 - caipirinha");
			System.out.println("| 2 - dry martini");
			System.out.println("| 3 - old fashion");
			System.out.println("| 4 - moscow mule");
			System.out.println("+=========+");
			System.out.println("Digite sua opcao");
			opcao = Integer.parseInt(leitor.readLine());
			
			switch (opcao) {
			case 1:
				objDrink = new caipirinha();
				break;
			case 2:
				objDrink = new dryMartini();
				break;
			case 3:
				objDrink = new oldFashion();
				break;
			case 4:
				objDrink = new moscowMule();
				break;
			}
			((MIXER) objDrink).misturar();
			objDrink.beber();
		} catch (Exception erro) {
			System.out.println("Chega de beber ! Va pra casa!");
		}
	}
}
