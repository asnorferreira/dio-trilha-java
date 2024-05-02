import java.util.Scanner;

public class SimpleControl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double limiteDiario = sc.nextDouble();
  
        for (int i = 0; i < limiteDiario; i++) {
            double valorSaque = sc.nextDouble();
            sc.nextLine();
            if (valorSaque == 0) {
                System.out.println("Transacoes encerradas.");
                break;
            }
            if (valorSaque >= 1) {
                if (valorSaque > limiteDiario) {
                    System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                    break;
                } else {
                    limiteDiario -= valorSaque;
                    System.out.println("Saque realizado. Limite restante: " + limiteDiario);
                }
            }
        }
        sc.close();
    }
}