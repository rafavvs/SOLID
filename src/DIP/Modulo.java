package DIP;

public class Modulo {
    
    // Depende da abstração CanalMensagem
    private final CanalMensagem canalComunicacao;

    // Inserção de dependência por construtor
    public Modulo(CanalMensagem canalComunicacao) {
        this.canalComunicacao = canalComunicacao;
    }

    public void avisarEntrega(String clienteContato) {
        String msg = "Seu pedido está a caminho!";
        canalComunicacao.transmitir(clienteContato, msg);
    }
}