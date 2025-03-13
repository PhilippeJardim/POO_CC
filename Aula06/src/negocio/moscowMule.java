package negocio;

	public class moscowMule extends drink implements MIXER{
		public void misturar () {
			super.adicionar(new ingrediente("Vodka", 100, "ml"));
			super.adicionar(new ingrediente("Gelo", 4, "pedras"));
			super.adicionar(new ingrediente("Gengibre", 20, "g"));
			super.adicionar(new ingrediente("Espuma de gengibre", 50, "ml"));
			super.adicionar(new ingrediente("Cachaça", 100, "ml"));
			super.adicionar(new ingrediente("Acucar", 5, "g"));
}
}