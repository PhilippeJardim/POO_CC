package negocio;

import java.util.ArrayList;
import java.util.Collection;

public class tipo {
// propriedades da classe
	private String descricao = "";
	
	// Métodos construtores de classe
	public tipo() {
		super();
	}
	public tipo(String descricao) {
		super();
		this.descricao = descricao;
	}
	
	// Métodos da classe
	public static Collection<tipo> getTodos() throws Exception {
	ArrayList<tipo> colecao = new ArrayList<tipo>();
	
	colecao.add(new tipo("Livro"));
	colecao.add(new tipo("Eletrônico"));
	colecao.add(new tipo("Alimentação"));
	colecao.add(new tipo("Brinquedo"));
	colecao.add(new tipo("Eletrodoméstico"));
	colecao.add(new tipo("Periféricos"));
	
	return colecao;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
