package OCP;
public class Dinheiro implements MetodoCobranca {
    @Override
    public void processar(double montante) {
        System.out.println("Recebendo dinheiro em espécie e calculando troco para: R$" + montante);
    }
}