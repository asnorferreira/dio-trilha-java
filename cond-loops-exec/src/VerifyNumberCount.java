// Entrada
// O programa solicitará ao usuário que digite o número da conta bancária.
// Saída
// O programa utilizará um bloco try-catch para verificar se o número da conta possui exatamente 8 dígitos.
// Se o número da conta tiver 8 dígitos, o programa informará que é um número válido.
// Se o número da conta não tiver 8 dígitos, o programa lançará uma exceção (por exemplo, IllegalArgumentException) e informará que o número da conta é inválido.

import java.util.Scanner;

public class VerifyNumberCount {
    private static void verificarNumeroConta(String numeroConta) {
        int numeroDeDigitos = numeroConta.length();
        if (numeroDeDigitos!= 8) {
            throw new IllegalArgumentException("Numero de conta deve ter 8 digitos.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Informe o número da sua conta: ");
            String numeroConta = sc.nextLine();
            
            verificarNumeroConta(numeroConta);

            System.out.println("Numero de conta valido.");

        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
