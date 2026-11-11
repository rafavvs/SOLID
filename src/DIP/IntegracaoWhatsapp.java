package DIP;

public class IntegracaoWhatsapp implements CanalMensagem {
    @Override
    public void transmitir(String destinatario, String conteudo) {
        System.out.println("Enviando mensagem de WhatsApp para " + destinatario + ": " + conteudo);
    }
}