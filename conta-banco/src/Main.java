public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome! Let's start a new bank account.");

        ContaTerminal account = ContaTerminal.createAccount();
        
        System.out.println();
        System.out.println("Your new bank account was created!");
        
        account.info();
    }
}
