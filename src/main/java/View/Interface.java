package View;

import Controller.Controller;
import Controller.FacadeController;
import Model.Cart;
import java.util.Scanner;
import Model.Produto;
import Model.ProdutoItem;
import Model.ProdutoItemPersistence;
import java.util.Observable;
import java.util.Observer;
public class Interface implements Observer {
    FacadeController facadeController;
    Controller controller;
    int qtdProdutos;
    int total;
    ProdutoItemPersistence persistence;
    public Interface(){
        this.persistence = new ProdutoItemPersistence();
        this.facadeController = new FacadeController(this);
        this.controller = this.facadeController.controller();

    }
    public void start(){
        this.menuPrincipal();
    }
    public void update(Observable o, Object arg) {
        this.total = ((Cart) o).getTotal();
        this.qtdProdutos = ((Cart) o).getQuantity();
        System.out.println("a");
    }
    public void menuPrincipal() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bem vindo ao Ecommerce");
        do{

            System.out.println("Digite 1 para ADICIONAR UM PRODUTO");
            System.out.println("Digite 2 para REMOVER UM PRODUTO");
            System.out.println("Digite 3 para PAGAR");
            System.out.println("Digite 4 para VER O CARRINHO");
            System.out.println("Digite 5 para SAIR");
            switch (scan.nextInt()) {
                case 1:menuSelectProduto();break;
                case 2:menuRemoveProduto();break;
                case 3:menuPagamento();break;
                case 4:
                    System.out.println(Cart.instance().toString());
                    break;
                case 5:
                    System.out.println("Obrigado por nos visitar!");
                    System.exit(1);
                default:
                    System.out.println("Selecione corretamente");
                    break;
            }
        }while(true);

    }
    public void menuPagamento(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Selecione o tipo de pagamento");
        System.out.println("Digite 1 para BOLETO");
        System.out.println("Digite 2 para CARTAO DE DEBITO");
        System.out.println("Digite 3 para CARTAO DE CREDITO");
        System.out.println("Digite 4 para PAYPAL");
        while(true){
            int res = scan.nextInt();
            if(res >= 1 && res <=4){
                this.controller.payment(res);
                return;
            }
            System.out.println("Selecione corretamente");
        }
    }
    public void menuSelectProduto(){
        do{
            System.out.println(this.persistence.toString());
            Produto newProduto = this.persistence.select((new Scanner(System.in)).nextInt());
            if(newProduto == null)
                System.out.println("Selecione um produto da lista");
            else{
                System.out.println("Quantos de " + newProduto.getNome() + " voce deseja colocar no carro ?");
                int res = (new Scanner(System.in)).nextInt();
                this.controller.addProduct(new ProdutoItem(newProduto,res));
                System.out.println("Operacao efetuada! Agora seu carrinho contem " + this.qtdProdutos + " produtos.");

                return;
            }
        }while (true);


    }
    public void menuRemoveProduto(){
            System.out.println(Cart.instance().toString());
            System.out.println("Selecione o produto para remover");
            Cart.instance().removeProduct((new Scanner(System.in)).nextInt());
            System.out.println("Operacao efetuada! Agora seu carrinho contem " + this.qtdProdutos + " produtos.");
    }
}
