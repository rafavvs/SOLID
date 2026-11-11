package LSP;

public abstract class Produto {
    protected String descricao;
    protected double precoBase;

    public Produto(String descricao, double precoBase) {
        this.descricao = descricao;
        this.precoBase = precoBase;
    }

    // As classes filhas devem calcular seu próprio preço final
    public abstract double calcularPrecoFinal();
    
    public String getDescricao() {
        return descricao;
    }
}
