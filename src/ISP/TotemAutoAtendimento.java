package ISP;

public class TotemAutoAtendimento implements OperadorComandas {
    @Override
    public void registrarNovoPedido() {
        System.out.println("Comanda registrada pelo próprio cliente.");
    }
}