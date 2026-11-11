package ISP;

public class Gerenciador implements AnalistaRelatorios, OperadorComandas {
    @Override
    public void extrairMetricasVendas() {
        System.out.println("Gerando Excel de fechamento do caixa...");
    }

    @Override
    public void registrarNovoPedido() {
        System.out.println("Pedido lançado manualmente pelo gerente.");
    }
}