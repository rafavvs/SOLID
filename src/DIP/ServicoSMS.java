package DIP;

public class ServicoSMS implements CanalMensagem {
    @Override
    public void transmitir(String destinatario, String conteudo) {
        System.out.println("Enviando SMS (via operadora) para " + destinatario + ": " + conteudo);
    }
}