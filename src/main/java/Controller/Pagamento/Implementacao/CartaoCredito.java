package Controller.Pagamento.Implementacao;

import Controller.Pagamento.Interface.IPagamento;

public class CartaoCredito implements IPagamento {

    CartaoCredito(){}

    public String executePayment() {
        return "Payment done by CARTAO DE CREDITO";
    }
}
