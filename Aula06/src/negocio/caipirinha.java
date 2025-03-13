package negocio;

public class caipirinha extends drink implements MIXER{
	public void misturar () {
		super.adicionar(new ingrediente("Cachaca", 100, "ml"));
		super.adicionar(new ingrediente("Limao", 3, "unidades"));
		super.adicionar(new ingrediente("Acucar", 5, "g"));
		super.adicionar(new ingrediente("Gelo", 8, "pedras"));
	}

}
