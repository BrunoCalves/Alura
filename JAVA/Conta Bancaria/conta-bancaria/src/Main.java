import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta();
        Scanner scanner = new Scanner(System.in);
        double deposito;
        int opcao;
        String textoMenu = """
               
               
               1 - Verificar Saldo
               2 - Depositar
               3 - Sacar
               4 - Sair
               
               
                """;

        String dadosConta = """
               ****************************************
                          Bem-vindo ao Banco!
               
               Nome: Bruno César Alves
               Tipo de conta: Poupança
               Saldo disponível: %s
               
               ****************************************
                """.formatted(conta.getSaldo());


        System.out.println(dadosConta);


        do{
            System.out.println(textoMenu);
            System.out.println("\nDigite a opção desejada: ");
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    conta.consultaSaldo();
                    break;
                case 2:
                    System.out.println("Digite o valor do deposito: ");
                    deposito = scanner.nextDouble();
                    conta.depositar(deposito);
                    conta.consultaSaldo();
                    break;
                case 3:
                    System.out.println("Digite o valor da transferencia: ");
                    deposito = scanner.nextDouble();
                    conta.transferir(deposito);
                    conta.consultaSaldo();
                    break;
                case 4:
                    System.out.println("Obrigado por utilizar BRN bank! ");
                    System.out.println("****************************************");
                    break;
                default:
                    System.out.println("Opção invalida!");
            }
        }while (opcao != 4);
    }
}