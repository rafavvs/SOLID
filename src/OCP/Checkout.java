package OCP;
public class Checkout {
    public void finalizarCompra(double montante, MetodoCobranca metodoEscolhido) {
        metodoEscolhido.processar(montante);
    }
}