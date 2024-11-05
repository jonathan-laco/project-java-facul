# Sistema de Gerenciamento de Clientes

Este é um projeto desenvolvido como parte da disciplina de Engenharia de Software. O objetivo é implementar um sistema simples para gerenciar clientes e suas operações financeiras, como compras, pagamentos e gerenciamento de limites de crédito.

## Estrutura do Projeto

A estrutura do projeto é a seguinte:

### Descrição das Classes

- **Cliente**: Classe base que contém os atributos e métodos comuns para todos os tipos de clientes, incluindo gerenciamento de limite e saldo devedor.

- **ClienteA**: Extensão da classe `Cliente` que implementa uma lógica específica para clientes que recebem um desconto de 10% em compras acima de 2000 e têm um limite inicial de 10000.

- **ClienteB**: Outra extensão da classe `Cliente`, com um desconto de 5% para compras acima de 1000 e um limite inicial de 5000.

- **ClienteC**: Classe simples que define um cliente com um limite inicial de 1000, sem lógica de desconto.

- **Main**: Classe responsável por executar o programa, demonstrando as funcionalidades de compras e pagamentos dos clientes.

## Funcionalidades

- Verificação de limite para compras
- Cálculo e aplicação de descontos para clientes específicos
- Efetuação de pagamentos e ajuste de limites de crédito
- Exibição de informações sobre limite e saldo devedor

## Entrada de Dados

Os valores de compras e pagamentos são definidos diretamente no código da classe `Main`. Durante a execução do programa, são realizadas operações de compra e pagamento com os seguintes valores:

- **Cliente A**: Realiza uma compra inicial de 5000 e um pagamento de 3000, seguido por uma compra com desconto.
- **Cliente B**: Realiza uma compra de 5000 e também demonstra um cenário de saldo insuficiente ao tentar realizar uma compra maior que seu limite.
- **Cliente C**: Realiza uma compra de 800 e efetua um pagamento de 500.

Para um uso mais interativo, você pode considerar implementar a leitura de dados via console, permitindo que os usuários insiram os valores das compras e pagamentos durante a execução do programa.


## Como Executar

1. Certifique-se de ter o Java JDK instalado em seu sistema.
2. Clone o repositório em sua máquina:
   ```bash
   git clone https://github.com/jonathan-laco/project-java-facul
   ```
