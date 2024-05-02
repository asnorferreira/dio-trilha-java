import java.util.Scanner;

public class VerifyEspecial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double limiteChequeEspecial = 500;

        try {
            System.out.println("Informe seu saldo: ");
            double saldo = sc.nextDouble();
            System.out.println("Informe o valor do cheque: ");
            double saque = sc.nextDouble();
            
            if(saque <= saldo){
                saldo -= saque;
                System.out.println("Transacao realizada com sucesso.");
            }
            else if(saque <= saldo + limiteChequeEspecial){
                double valorDebitado = saque - saldo;
                saldo = 0;
                limiteChequeEspecial -= valorDebitado;
                System.out.println("Transacao realizada com sucesso utilizando o cheque especial.");
            } else {
                System.out.println("Transacao não realizada. Limite do cheque especial excedido.");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally{
            sc.close();
        }
    }
}