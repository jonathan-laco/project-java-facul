public class Cliente {

    protected double limite;
    protected double saldoDevedor;

    public boolean verificarLimite(double valorCompra) {
        return valorCompra <= (limite - saldoDevedor);
    }
    // def valores(){ return 0; { return 0; } }

    public void mostrarLimite() {
        System.out.println("Seu limite é: " + limite);
    }

    public void mostrarSaldoDevedor() {
        System.out.println("Seu saldo devedor é: " + saldoDevedor);
    }

    public void efetuarPagamento(double valorPagamento) {
        saldoDevedor -= valorPagamento;
        limite += valorPagamento;
        System.out.println("Pagamento efetuado: " + valorPagamento + " Novo saldo devedor: " + saldoDevedor);
    }

    public void efetuarCompra(double valorCompra) {
        saldoDevedor += valorCompra;
        limite -= valorCompra;
        System.out.println("Compra efetuada! Novo saldo devedor: " + saldoDevedor);
    }

    public double calcularDesconto(double valorCompra) {
        return 0; // Retorne 0 ou o valor do desconto se for necessário
    }

    public void aumentarLimite(double valorAumento) {
        limite += valorAumento;
        System.out.println("Limite aumentado. Novo limite: " + limite);
    }

    public double getSaldoDevedor() {
        return saldoDevedor;
    }
}
