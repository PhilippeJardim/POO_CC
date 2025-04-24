package negocio;

public class produto {
// Propriedades da classe
	private String nome = "";
	private double preco = 0;
	private tipo objtipo = null;
	private boolean perecivel = false;
	private String detalhamento = "";
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public tipo getObjtipo() {
		return objtipo;
	}
	public void setObjtipo(tipo objtipo) {
		this.objtipo = objtipo;
	}
	public boolean isPerecivel() {
		return perecivel;
	}
	public void setPerecivel(boolean perecivel) {
		this.perecivel = perecivel;
	}
	public String getDetalhamento() {
		return detalhamento;
	}
	public void setDetalhamento(String detalhamento) {
		this.detalhamento = detalhamento;
	}
	public produto() {
		super();
	}
	public produto(String nome, double preco, tipo objtipo, boolean perecivel, String detalhamento) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.objtipo = objtipo;
		this.perecivel = perecivel;
		this.detalhamento = detalhamento;
	}
	
	// Métodos construtores
}
