package negocio;

	public class oldFashion extends drink implements MIXER{
		public void misturar () {
			super.adicionar(new ingrediente("Whisky", 200, "ml"));
			super.adicionar(new ingrediente("Gelo", 1, "esfera"));
			super.adicionar(new ingrediente("Acucar", 5, "g"));
			super.adicionar(new ingrediente("Laranja", 1, "casca"));
			super.adicionar(new ingrediente("Bitter", 2, "gotas"));
}
}