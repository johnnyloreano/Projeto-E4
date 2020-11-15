package Controller.Pagamento.Implementacao;

import Controller.Pagamento.Interface.IPagamento;

public class CartaoDebito implements IPagamento {

    CartaoDebito(){}

    public String executePayment() {
        return "Payment done by CARTAO DE DEBITO";
    }
}
