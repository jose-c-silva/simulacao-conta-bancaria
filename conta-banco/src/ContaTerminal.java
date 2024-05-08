import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){

        String nome;
        int numero;
        String agencia;
        double saldo;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o seu nome: ");
        nome = scanner.next();

        System.out.println("Agora digite o número da sua conta: ");
        numero = scanner.nextInt();

        System.out.println("Por último, digite o número da sua agência: ");
        agencia = scanner.next();

        System.out.println("Quanto será o seu primeiro depósito? ");
        saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
    }
}
