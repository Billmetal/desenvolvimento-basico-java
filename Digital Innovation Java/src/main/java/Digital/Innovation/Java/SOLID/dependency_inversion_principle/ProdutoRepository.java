package Digital.Innovation.Java.SOLID.dependency_inversion_principle;

import java.util.ArrayList;
import java.util.List;

public class ProdutoRepository {
	
	private DbConnection dbConnection;
	
	public ProdutoRepository(DbConnection dbConnection) {
		this.dbConnection = dbConnection;
	}
	
	public List<Produto> buscarProdutos(){
		// retorna a lista de produtos da base de dados
		return new ArrayList<>();
	}
	
	public void salvarProduto(Produto produto) {
		// salva o produto na base de dados
	}

}
