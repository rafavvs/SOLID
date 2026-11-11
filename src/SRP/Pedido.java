package SRP;
import java.util.List;

public class Pedido {
    private int id;
    private String nomeCliente;
    private List<String> itens;
    private double valorTotal;

    public Pedido(int id, String nomeCliente, List<String> itens, double valorTotal) {
        this.id = id;
        this.nomeCliente = nomeCliente;
        this.itens = itens;
        this.valorTotal = valorTotal;
    }

    // Getters
    public int getId() {
        return id;
    }
    public String getNomeCliente() {
        return nomeCliente;
    }
    public List<String> getItens() {
        return itens;
    }
    public double getValorTotal() {
        return valorTotal;
    }
}