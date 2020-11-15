package Model;

public class ProdutoItem {

	private Produto produto;

	private int qtdProduto;

	public ProdutoItem(Produto produto, int qtdProduto){
		this.produto = produto;
		this.qtdProduto = qtdProduto;
	}

	public int total(){
		return this.produto.getValue() * qtdProduto;
	}
	@Override
	public String toString() {
		String msg = "";
		msg += produto.toString();
		msg += "\nQuantidade: " + qtdProduto;
		msg += "\n Custo total: " + this.total();
		return msg;
	}
}
