package SRP;
public class ExibirPedido {
    
    public void exibirInformacoes(Pedido pedido) {
        System.out.println("===================================");
        System.out.println("        DETALHES DO PEDIDO         ");
        System.out.println("===================================");
        System.out.println("ID do Pedido: " + pedido.getId());
        System.out.println("Cliente: " + pedido.getNomeCliente());
        System.out.println("Itens: " + String.join(", ", pedido.getItens()));
        System.out.printf("Valor Total: R$ %.2f\n", pedido.getValorTotal());
        System.out.println("===================================");
    }
}