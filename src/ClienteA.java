public class ClienteA extends Cliente {

    private double desconto;
    private int qtdDesconto;

    public ClienteA() {
        this.desconto = 0.1; // Desconto de 10%
        this.qtdDesconto = 0; // Inicializando quantidade de descontos
        limite = 10000; // Limite inicial
    }

    @Override
    public double calcularDesconto(double valorCompra) {
        double descontoAplicado = 0;
        if (valorCompra >= 2000) { // Condição para desconto
            descontoAplicado = valorCompra * desconto; // Calcular desconto
            qtdDesconto++; // Incrementar a quantidade de descontos
            System.out.println("Cliente A - Desconto aplicado: " + descontoAplicado);
        }
        return descontoAplicado;
    }

    @Override
    public void aumentarLimite(double valorCompra) {
        if (valorCompra >= 5000) {
            limite += 500; // Aumenta o limite em 500
            System.out.println("Cliente A - Limite aumentado para: " + limite);
        }
    }

    public int getQtdDesconto() {
        return qtdDesconto; // Adicionando um método para acessar qtdDesconto
    }
}
