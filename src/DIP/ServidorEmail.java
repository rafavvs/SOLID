package DIP;

public class ServidorEmail implements CanalMensagem {
    @Override
    public void transmitir(String destinatario, String conteudo) {
        System.out.println("Enviando E-mail para " + destinatario + " Assunto: " + conteudo);
    }
}