package Controller;

import Controller.Pagamento.Implementacao.PagamentoFactory;
import Controller.Pagamento.Interface.IPagamento;
import Model.Cart;
import Model.Produto;
import Model.ProdutoItem;
import View.Interface;

public class Controller {
    private Interface anInterface;
    private Cart cart;
    private PagamentoFactory pagamentoFactory;
    public Controller(Interface anInterface, Cart cart){
        this.anInterface = anInterface;
        this.cart = cart;
        this.pagamentoFactory = new PagamentoFactory();
        this.cart.addObserver(this.anInterface);
    }
    public void addProduct(ProdutoItem produtoItem){
        this.cart.addProduct(produtoItem);
    }
    public void removeProduct(ProdutoItem produtoItem){
        this.cart.removeProduct(produtoItem);
    }
    public void payment(int index){
        IPagamento iPagamento = this.pagamentoFactory.createPagamento(index);
        System.out.println( (iPagamento.executePayment() ) );
        this.cart.clearCart();
    }
}