package apresentaçao;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import negocio.Cilindro;
import negocio.Cubo;
import negocio.Solido;

public class VisaoGeometrica {
	public static void main (String[] args) {
	// Declaracao de variaveis
	BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
	Solido objSolido = null;
	int opcao = 0;
	
	//Entrada de dados
	try {
		System.out.print("Digite ,<1> para cubo ou <2> para cilindro: ");
		opcao = Integer.parseInt(leitor.readLine());
		
		if (opcao == 1) {
			objSolido = new Cubo();
			
			System.out.print("Digite a aresta: ");
			((Cubo) objSolido).setAresta(Double.parseDouble(leitor.readLine)));
		} else {
			objSolido = new Cilindro();
			
			
		}
		
	} catch (Exception erro) {
		System.out.println(erro);
	}
}