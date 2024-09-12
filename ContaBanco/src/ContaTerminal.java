import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importar a classe Scanner
        Scanner dados = new Scanner(System.in);
        
        //Exibir as mensagens para o nosso usuário
        System.out.print("Digite o número da conta: ");
        int numero = dados.nextInt();

        System.out.print("Digite o número da agência: ");
        int agencia = dados.nextInt(); 

        System.out.print("Digite o nome do cliente: ");
        String nomeDoCliente = dados.nextLine(); 

        System.out.print("Digite o seu saldo: ");
        double saldo = dados.nextDouble(); 

        //Obter pela scanner os valores digitais no terminal 

        //Exibir a mensagem conta criada
        dados.close();
    }
}
