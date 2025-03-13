package negocio;

	public class dryMartini extends drink implements MIXER{
		public void misturar () {
			super.adicionar(new ingrediente("Gyn", 100, "ml"));
			super.adicionar(new ingrediente("Vodka", 50, "ml"));
			super.adicionar(new ingrediente("Vermuth", 10, "ml"));
			super.adicionar(new ingrediente("Gelo", 10, "pedras"));
			super.adicionar(new ingrediente("Azeitona", 3, "unidades"));
}
}