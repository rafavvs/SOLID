package OCP;
public class Cartao implements MetodoCobranca {
    @Override
    public void processar(double montante) {
        System.out.println("Aprovando transação via maquininha de Cartão: R$" + montante);
    }
}