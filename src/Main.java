public class Main {

    public static void main(String[] args) {

        // Cliente A faz a primeira compra
        System.out.println("------------------Cliente A------------------");
        ClienteA clienteA = new ClienteA();
        clienteA.mostrarLimite();
        realizarCompra(clienteA, 5000, "CLIENTE A");
        aumentadoLimite(clienteA, 5000);
        realizarPagamento(clienteA, 3000);
        clienteA.mostrarLimite(); // Exibe o limite após o pagamento
        System.out.println("------------------///////------------------");

        // Cliente A faz a segunda compra com desconto
        System.out.println("------------------Cliente A segunda compra------------------");
        System.out.println("Cliente A - Compra com desconto");
        realizarCompra(clienteA, 1000, "CLIENTE A");
        clienteA.mostrarLimite();

        // Cliente B faz a primeira compra
        System.out.println("------------------Cliente B------------------");
        ClienteB clienteB = new ClienteB();
        clienteB.mostrarLimite(); // Exibe o limite do Cliente B
        realizarCompra(clienteB, 5000, "CLIENTE B");
        realizarPagamento(clienteB, 0); // Pagamento de 0.0 conforme esperado
        clienteB.mostrarQtdDescontos(); // Exibe a quantidade de descontos aplicados

        // Cliente B com limite insuficiente
        System.out.println("------------------ limite insuficiente------------------");
        System.out.println("Cliente B - Cenario de Saldo Insuficiente:");
        clienteB.mostrarLimite(); // Exibe o limite do Cliente B novamente
        realizarCompra(clienteB, 8000, "CLIENTE B");

        // Cliente C - primeira compra
        System.out.println("------------------Cliente C------------------");
        ClienteC clienteC = new ClienteC();
        clienteC.mostrarLimite();
        realizarCompra(clienteC, 800, "CLIENTE C");
        realizarPagamento(clienteC, 500);
        clienteC.mostrarLimite();
    }

    private static void realizarCompra(Cliente cliente, double valorCompra, String descricao) {
        if (cliente.verificarLimite(valorCompra)) {
            double desconto = cliente.calcularDesconto(valorCompra);
            cliente.efetuarCompra(valorCompra - desconto);
            System.out.println(descricao + " - compra efetuada com sucesso");
        } else {
            System.out.println(descricao + " - saldo insuficiente");
        }
    }

    public static void realizarPagamento(Cliente cliente, double valorPagamento) {
        cliente.efetuarPagamento(valorPagamento);
    }

    private static void aumentadoLimite(Cliente cliente, double valorCompra) {
        if (valorCompra >= 5000) {
            cliente.aumentarLimite(valorCompra);
        }
    }
}
