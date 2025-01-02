import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Por favor, digite o número da conta");
        int numeroConta = scanner.nextInt();
        
        System.out.println("Por favor, digite o número da Agência");
        String agencia = scanner.next();

        System.out.println("Por favor, digite seu nome");
        String nome = scanner.next();

        System.out.println("Por favor, digite seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Digite o valor solicitado para saque");
        double saldo = scanner.nextDouble();

        //imprimindo os dados obtidos pelo usuario
        System.out.println("Olá "+nome+" "+sobrenome+", obrigado por criar uma conta em nosso banco");
        System.out.println("Sua agência é: "+agencia+", conta: "+numeroConta+" e seu saldo "+saldo+" já está disponível para saque.");


    }
}
