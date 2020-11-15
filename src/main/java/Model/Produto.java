package Model;

public class Produto {

    private int value;
    private String nome;
    private String descricao;
    public Produto(int value, String nome, String descricao) {
        this.value = value;
        this.nome = nome;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        String msg = "\n";
        msg += "Nome: " + nome;
        msg += "\nDescricao: " + descricao;
        msg += "\nValor: " + value;
        return msg ;
    }
}
