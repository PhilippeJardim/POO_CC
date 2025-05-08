package NEGÓCIO;

import java.util.ArrayList;
import java.util.Collection;

public class FABRICANTE {
// Propriedades da classe
	private String nome = "";
	
	// Métodos da classe
	public static Collection<FABRICANTE> getTodos() throws Exception {
		ArrayList<FABRICANTE> colecao = new ArrayList<FABRICANTE>();
		colecao.add(new FABRICANTE("Audi"));
		colecao.add(new FABRICANTE("BMW"));
		colecao.add(new FABRICANTE("Chevrolet"));
		colecao.add(new FABRICANTE("Ford"));
		colecao.add(new FABRICANTE("Honda"));
		colecao.add(new FABRICANTE("Jaguar"));
		colecao.add(new FABRICANTE("Maseratti"));
		colecao.add(new FABRICANTE("Toyota"));
		
		return colecao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public FABRICANTE(String nome) {
		super();
		this.nome = nome;
	}

	public FABRICANTE() {
		super();
	}
}


