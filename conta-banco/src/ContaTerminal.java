import java.util.Scanner;

public class ContaTerminal {
    public int numero;
    public String agencia;
    public String nomeCliente;
    public double saldo;

    public ContaTerminal(int n, String a, String c, double s){
        this.numero = n;
        this.agencia = a;
        this.nomeCliente = c;
        this.saldo = s;
    }

    public int getNumero(){
        return this.numero;
    }

    public String getAgencia(){
        return this.agencia;
    }

    public String getNomeCliente(){
        return this.nomeCliente;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void info(){
        System.out.println("Olá " + this.nomeCliente + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é " + this.agencia + ", conta " + this.numero + " e seu saldo é R$ " + this.saldo);
    }

    public static ContaTerminal createAccount(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número da conta: ");
        int n = sc.nextInt();

        System.out.println("Digite o número da agência: ");
        String a = sc.next();

        sc.nextLine();

        System.out.println("Digite o nome do cliente: ");
        String c = sc.nextLine();

        System.out.println("Digite o saldo inicial: ");
        double s = sc.nextDouble();

        sc.close();

        return new ContaTerminal(n, a, c, s);
    }
}
