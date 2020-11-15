package Controller.Pagamento.Implementacao;

import Controller.Pagamento.Interface.IPagamento;

public class PagamentoFactory {

    public PagamentoFactory(){}

    public IPagamento createPagamento(int index){
        switch (index) {
            case 1:
                return new Boleto();
            case 2: return new CartaoCredito();
            case 3: return new CartaoDebito();
            case 4: return new PayPal();
            default: throw new IllegalArgumentException("Selecione um tipo de pagamento correto!");
        }
    }
}
