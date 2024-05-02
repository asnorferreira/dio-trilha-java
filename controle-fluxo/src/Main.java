public class Main {
    public static void main(String[] args) throws Exception {
        try {
            Contador c = Contador.count();
            System.out.println("The count was created successfully!");

            c.info();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
