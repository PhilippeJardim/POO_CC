package persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Collection;
import java.util.LinkedList;

import negocio.Cargo;

public class CargoDAO {
	// Propriedades da classe
	private BancoDeDados objBanco = new BancoDeDados();
	private PreparedStatement objExecucao = null;
	private ResultSet objCursor = null;
	
	// Métodos da classe
	public Collection<Cargo> getTodos() throws Exception {
		LinkedList<Cargo> colecao = new LinkedList<Cargo>();
		objBanco.conectar();
		
		objExecucao = objBanco.getObjConexao().prepareStatement("SELECT * FROM CRG_CARGO");
		objCursor = objExecucao.executeQuery();
		while (objCursor.next()) {
			colecao.add(new Cargo(objCursor.getInt("CRG_ID"),
								objCursor.getString("CRG_NOME"),
								objCursor.getDouble("CRG_SALARIO")));
		}
		
		objBanco.desconectar();
		
		return colecao;
}
}