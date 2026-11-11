package LSP;

public class Hamburguer extends Produto {
    private int quantidade;

    public Hamburguer(String descricao, double precoBase, int quantidade) {
        super(descricao, precoBase);
        this.quantidade = quantidade;
    }

    @Override
    public double calcularPrecoFinal() {
        return precoBase + (quantidade * 5.0); // R$5 por carne extra
    }
}
