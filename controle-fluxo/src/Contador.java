import java.util.Scanner;

public class Contador {
    private int numOne;
    private int numTwo;

    private Contador(int o, int t) {
        this.numOne = o;
        this.numTwo = t;
    }

    public int getNumOne() {
        return numOne;
    }

    public int getNumTwo() {
        return numTwo;
    }

    public void info() {
        System.out.println("Count: [" + numOne + " -> " + numTwo + "]");
    }

    public static Contador count() throws ParametrosInvalidosException {
        try (Scanner sc = new Scanner(System.in);){

            System.out.println("Write the first parameter: ");
            int o = sc.nextInt();

            sc.nextLine();

            System.out.println("Write the second parameter: ");
            int t = sc.nextInt();

            sc.close();
            
            if (o >= t){
                throw new ParametrosInvalidosException("The second pa2rameter must be greater than the first parameter!");
            }

            int counts = 0;
            for (int i = o; i < t; i++) {
                System.out.println("Imprimindo o número: " + i);
                counts++;
            }

            System.out.println("Total of counts: " + counts);

            return new Contador(o, t);
        } catch (Exception e) {
            throw new ParametrosInvalidosException("Error while counting: " + e.getMessage());
        }
    }
}
