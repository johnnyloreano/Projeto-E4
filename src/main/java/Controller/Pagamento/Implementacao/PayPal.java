package Controller.Pagamento.Implementacao;

import Controller.Pagamento.Interface.IPagamento;

public class PayPal implements IPagamento {
    public PayPal(){}

    public String executePayment() {
        return "Payment done by PAYPAL";
    }
}
