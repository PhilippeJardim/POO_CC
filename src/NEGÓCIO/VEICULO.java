package NEGÓCIO;

public class VEICULO {

	// Propriedades da classe
	private FABRICANTE objFABRICANTE = null;
	private String modelo ="";
	private String cor ="";
	private boolean TetoSolar = false;
	public FABRICANTE getObjFABRICANTE() {
		return objFABRICANTE;
	}
	public void setObjFABRICANTE(FABRICANTE objFABRICANTE) {
		this.objFABRICANTE = objFABRICANTE;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public boolean isTetoSolar() {
		return TetoSolar;
	}
	public void setTetoSolar(boolean tetoSolar) {
		TetoSolar = tetoSolar;
	}
	public VEICULO(FABRICANTE objFABRICANTE, String modelo, String cor, boolean tetoSolar) {
		super();
		this.objFABRICANTE = objFABRICANTE;
		this.modelo = modelo;
		this.cor = cor;
		TetoSolar = tetoSolar;
	}
	public VEICULO() {
		super();
	}
}
// Métodos construtores da classe
