public class ClienteB extends Cliente {

    private static double desconto;
    private static int qtdDesconto;

    public ClienteB() {
        desconto = 0.5; // Desconto de 50%
        qtdDesconto = 0; // Inicializando quantidade de descontos
        limite = 5000; // Limite inicial
    }

    @Override
    public double calcularDesconto(double valorCompra) {
        double descontoAplicado = 0;
        if (qtdDesconto > 0) {
            descontoAplicado = valorCompra * desconto;
            System.out.println("Desconto aplicado: " + descontoAplicado);
        }
        return descontoAplicado;
    }

    @Override
    public void efetuarPagamento(double valorPagamento) {
        saldoDevedor -= valorPagamento;
        limite += valorPagamento;
        System.out.println(
                "CLIENTE B - Pagamento efetuado: " + valorPagamento + ". Saldo devedor atual: " + saldoDevedor);
    }

    public void mostrarQtdDescontos() {
        System.out.println("CLIENTE B - Quantidade de descontos aplicados: " + qtdDesconto);
    }
}
