package Model;

import java.util.Observable;
import java.util.ArrayList;

public class Cart extends Observable {

	private static Cart cart;
	private ArrayList<ProdutoItem> produtoItemList;

	private Cart(){
		this.produtoItemList = new ArrayList<ProdutoItem>();
	}
	public static Cart instance() {
		if (cart == null)
			cart = new Cart();
		return cart;
	}
	public int getQuantity(){
		return this.produtoItemList.size();
	}
	public int getTotal(){
		int res = 0;
		for (ProdutoItem produtoItem: produtoItemList)
			res += produtoItem.total();
		return res;
	}
	public void addProduct(ProdutoItem produtoItem){
		this.produtoItemList.add(produtoItem);
		notifyObservers();
	}

	public void clearCart(){
		this.produtoItemList.clear();
		notifyObservers();
	}
	public void removeProduct(ProdutoItem produtoItem){
		this.produtoItemList.remove(produtoItem);
		notifyObservers();
	}
	public void removeProduct(int index){
		this.produtoItemList.remove(index);
		notifyObservers();
	}


	public String toString(){
		if(produtoItemList.size() == 0)
			return "Cart is empty!";
		String msg = "Product list:\n";
		int total = 0;
		for (ProdutoItem pi : produtoItemList) {
			msg += pi.toString() + "\n";
			total += pi.total();
		}
		msg += "\n Preco final das compras: " + total;
		return msg;
	}
}
