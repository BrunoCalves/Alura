
public class Main {
    static void menu(){
        String textoMenu = """
               ****************************************
                          Bem vindo ao Banco!
               
               1 - Verificar Saldo
               2 - Depositar
               3 - Sacar
               4 - Transferir
               5 - Sair
               
               ****************************************
                """;

        System.out.println(textoMenu);
    }
    public static void main(String[] args) {
        System.out.println("Inciando o projeto conta bancaria!");
        menu();
    }
}