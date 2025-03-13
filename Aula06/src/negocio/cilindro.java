package negocio;

public class Cilindro implements Solido {
	// Propriedades da classe
	public double raio = 0;
	public double altura = 0;
	
	// Construtores
	public Cilindro(double raio, double altura) {
		super();
		this.raio = raio;
		this.altura = altura;
	}
	public Cilindro() {
		super();
	}
	// Get e set
	public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) {
		this.raio = raio;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	// Métodos implementados pela interface
	public double calcularArea() {
		return (Math.PI * Math.pow(getRaio(),  2) + (2 * Math.PI * getRaio() * getAltura());
	public double calcularVolume() {
		return (Math.PI * Math.pow(getRaio(),  2) * getAltura));
	}
