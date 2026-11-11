package LSP;

public class Pizza extends Produto {
    private boolean bordaRecheada;

    public Pizza(String descricao, double precoBase, boolean bordaRecheada) {
        super(descricao, precoBase);
        this.bordaRecheada = bordaRecheada;
    }

    @Override
    public double calcularPrecoFinal() {
        return bordaRecheada ? precoBase + 10.0 : precoBase; // R$10 para borda recheada
    }
}