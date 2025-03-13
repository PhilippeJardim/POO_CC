package negocio;

public abstract class drink {
	// Propriedades da classe
	private ingrediente[] colecao = new ingrediente[10];
	private int qtdIngredientes = 0;
	
	//Métodos da classe
	public void adicionar(ingrediente objIngrediente) {
		colecao[qtdIngredientes] = objIngrediente;
		qtdIngredientes++;
	}
	public void beber() {
		for (int i = 0 ; i < qtdIngredientes ; i++) {
			System.out.println(colecao[i].getQuantidade() + " " +
								colecao[i].getUnidade() + " de " +
								colecao[i].getNome());
		}
	}

}
