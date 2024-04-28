import java.util.Scanner;

public  class ContaTerminal {
    public static void main(String[] args)
    {
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem Vindo ao Sistema Bancario!");
        System.out.print("Digite seu nome: ");
        nomeCliente = scanner.nextLine();
        System.out.print("Digite sua agencia: ");
        agencia = scanner.nextLine();
        System.out.print("Digite seu numero: ");
        numero = scanner.nextInt();
        System.out.print("Digite seu saldo: ");
        saldo = scanner.nextDouble();

        System.out.println("Ola "+ nomeCliente +", obrigado por criar uma conta em nosso banco, sua agencia e "+ agencia +", conta " + numero + " e seu saldo "+ saldo + " ja esta disponivel para saque.");
    }
}
