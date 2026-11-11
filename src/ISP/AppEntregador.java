package ISP;

public class AppEntregador implements LogisticaEntregas, EmissorNotificacao {
    @Override
    public void despacharParaMotoboy() {
        System.out.println("Rota aceita pelo entregador.");
    }

    @Override
    public void enviarAlerta(String mensagem) {
        System.out.println("Motoboy: " + mensagem);
    }
}