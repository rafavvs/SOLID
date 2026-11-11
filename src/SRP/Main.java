package SRP;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 1. Criar o pedido
        Pedido pedido = new Pedido(
            101, 
            "Andrey Mauricio", 
            Arrays.asList("1x Pizza Frango Catupiry", "2x Refrigerante"), 
            105.50
        );

        // 2. Exibir as informações do pedido
        ExibirPedido print = new ExibirPedido();
        print.exibirInformacoes(pedido);

        // 3. Salvar o pedido
        SalvarPedido pacote = new SalvarPedido();
        pacote.salvar(pedido);
    }
}
