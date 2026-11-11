package DIP;

public class Main {
    public static void main(String[] args) {
        CanalMensagem wpp = new IntegracaoWhatsapp();
        Modulo msg = new Modulo(wpp);
        msg.avisarEntrega("4002-8922");
    }
}