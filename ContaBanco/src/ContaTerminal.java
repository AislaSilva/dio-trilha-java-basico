import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        System.out.println(" Olá, seja bem-vindo! ");

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Qual seu nome completo? ");
        String nomeCompleto = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta!");
        String numeroConta = scanner.nextLine();

        System.out.println("Por favor, digite o número da Agência!");
        int agencia = scanner.nextInt();

        double saldo = 237.48;

        System.out.println("Olá " + nomeCompleto + ", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia + ", conta " + numeroConta + " e seu saldo R$ " + saldo + " já está disponível para saque.");

        scanner.close();

    }

}
