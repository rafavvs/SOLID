package SRP;
public class SalvarPedido {
    
    public void salvar(Pedido pedido) {
        // Lógica para conectar ao banco de dados e salvar o pedido
        System.out.println("Salvando o pedido #" + pedido.getId() + " do cliente " + pedido.getNomeCliente() + " no banco de dados...");
    }
}