package Controller.Pagamento.Implementacao;

import Controller.Pagamento.Interface.IPagamento;

public class Boleto implements IPagamento {

    public Boleto(){}

    public String executePayment(){
        return "Payment done by BOLETO";
    }

}
