package OCP;
public class Pix implements MetodoCobranca {
    @Override
    public void processar(double montante) {
        System.out.println("Gerando QR Code do PIX para o valor: R$" + montante);
    }
}