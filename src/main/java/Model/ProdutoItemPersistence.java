package Model;

import java.util.ArrayList;

public class ProdutoItemPersistence {
    public ArrayList<Produto> arrayProdutoItem = new ArrayList<Produto>();

    public ProdutoItemPersistence(){
        this.arrayProdutoItem.add(new Produto(10,"Tenis", "Um tenis legal"));
        this.arrayProdutoItem.add(new Produto(5,"Camisa", "Uma camisa da NÁIKE"));
        this.arrayProdutoItem.add(new Produto(8,"Bola quadrada", "Uma bola QUADRADA KKK"));
        this.arrayProdutoItem.add(new Produto(10,"Video game", "Tá mt barato oloco"));
        this.arrayProdutoItem.add(new Produto(34,"Caixa de som", "perfeito pra usar no centro rs"));
        this.arrayProdutoItem.add(new Produto(2,"Prancha de surf", "Engana bastante rs"));
        this.arrayProdutoItem.add(new Produto(11,"Viola", "Da pra tira uns SLIPKNOTE daora"));
        this.arrayProdutoItem.add(new Produto(9,"Peixe", "Leva, ta bem fedorento vish"));
        this.arrayProdutoItem.add(new Produto(12,"Manga", "Madura"));
        this.arrayProdutoItem.add(new Produto(8,"Berinjela", "Verdinha"));
    }
    public Produto select(int index){
        if( this.arrayProdutoItem.size() - 1 < index)
            return null;
        Produto p = this.arrayProdutoItem.get(index);
        this.arrayProdutoItem.remove(index);
        return p;

    }
    public String toString(){
        String msg = "";
        int c = 0;
        for (Produto produto: arrayProdutoItem){ msg += "\n\nPosicao: "+c + produto.toString(); c++;}

        return msg;
    }
}
