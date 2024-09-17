import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        //TODO: Conhecer e importar a classe Scanner
        Scanner dados = new Scanner(System.in);
        
        //Exibir as mensagens para o nosso usuário
        System.out.println("Digite o número da conta: ");
        int numero = dados.nextInt();

        System.out.println("Digite o número da agência: ");
        int agencia = dados.nextInt(); 

        dados.nextLine();

        System.out.println("Digite o nome do cliente: ");
        String nomeDoCliente = dados.nextLine();

        System.out.println("Digite o seu saldo: ");
        double saldo = dados.nextDouble(); 

        //Obter pela scanner os valores digitais no terminal 

        //Exibir a mensagem conta criada
        System.out.println("Olá "+nomeDoCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque");
        //dados.close();
    }
}
