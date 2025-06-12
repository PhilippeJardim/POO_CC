package persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;

import negocio.Cargo;
import negocio.Colaborador;

public class ColaboradorDAO {
	// Propriedades da classe
	private BancoDeDados objBanco = new BancoDeDados();
	private PreparedStatement objExecucao = null;
	private ResultSet objCursor = null;
	
	// Métodos da classe
	public Collection<Colaborador> getTodos() throws Exception {
		ArrayList<Colaborador> colecao = new ArrayList<Colaborador>();
		
		objBanco.conectar();
		// SELECIONAR
		objExecucao = objBanco.getObjConexao().prepareStatement(
											"SELECT * " +
											"FROM CRG_CARGO, COL_COLABORADOR " +
											"WHERE CRG_ID = COL_IDCARGO");
		objCursor = objExecucao.executeQuery();
		while (objCursor.next()) {
			colecao.add(new Colaborador(objCursor.getInt("COL_ID"),
										new Cargo(objCursor.getInt("CRG_ID"),
												objCursor.getString("CRG_NOME"),
												objCursor.getDouble("CRG_SALARIO")),
						objCursor.getString("COL_NOME")));
		}
		
		objBanco.desconectar();
		
		return colecao;
}
	
	public void persistir(Colaborador objColaborador) throws Exception {
		objBanco.conectar();
		// INSERÇÃO
		objExecucao = objBanco.getObjConexao().prepareStatement(
											"INSERT INTO COL_COLABORADOR" +
											"(COL_IDCARGO, COL_NOME)" +
											"VALUES" +
											"(?, ?)");
		objExecucao.setInt(1, objColaborador.getObjCargo().getId());
		objExecucao.setString(2, objColaborador.getNome());
		
		objExecucao.executeUpdate();
		
		objBanco.desconectar();
	}
}