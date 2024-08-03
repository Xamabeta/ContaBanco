import java.util.Scanner;
import java.util.Locale;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite sua conta:");
        int conta = scanner.nextInt();

        System.out.println("Digite sua agência:");
        String agencia = scanner.next();


        System.out.println("Digite seu nome:");
        String nomeCliente = scanner.next();

        System.out.println("Digite seu saldo:");
        Double saldo = scanner.nextDouble();

        System.out.println("Olá, " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é "+ agencia +", conta " + conta + " e seu saldo "+ saldo + " já está disponível para saque");

    }
}