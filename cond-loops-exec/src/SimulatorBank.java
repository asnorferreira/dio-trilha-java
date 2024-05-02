import java.util.Scanner;

public class SimulatorBank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double saldo = 0;

        System.out.println("1 - Depositar");
        System.out.println("2 - Sacar");
        System.out.println("3 - Consultar Saldo");
        System.out.println("4 - Encerrar");

        while (true) {
            System.out.println("Digite a opção desejada: ");
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Digite o valor a ser depositado: ");
                    double deposito = sc.nextDouble();
                    saldo += deposito;
                    System.out.println("Valor depositado com sucesso!");
                    break;

                case 2:
                    System.out.println("Digite o valor a ser sacado: ");
                    double saque = sc.nextDouble();
                    if (saque > saldo) {
                        System.out.println("Saldo insuficiente!");
                    } else {
                        saldo -= saque;
                        System.out.println("Valor sacado com sucesso!");
                    }
                    break;

                case 3:
                    System.out.println("Seu saldo é: " + saldo);
                    break;

                case 4:
                    System.out.println("Encerrando...");
                    sc.close();
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }
}