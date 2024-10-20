public class ClienteB extends Cliente {

    private double desconto;
    private int qtdDesconto;

    public ClienteB() {
        this.desconto = 0.05; // Desconto de 5%
        this.qtdDesconto = 0; // Inicializando quantidade de descontos
        limite = 5000; // Limite inicial
    }

    @Override
    public double calcularDesconto(double valorCompra) {
        double descontoAplicado = 0;
        if (valorCompra >= 1000) { // Condição para desconto
            descontoAplicado = valorCompra * desconto; // Calcular desconto
            qtdDesconto++; // Incrementar a quantidade de descontos
            System.out.println("Cliente B - Desconto aplicado: " + descontoAplicado);
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
