package LSP;

public class Bebida extends Produto {
    public Bebida(String descricao, double precoBase) {
        super(descricao, precoBase);
    }

    @Override
    public double calcularPrecoFinal() {
        return precoBase; 
    }
}
