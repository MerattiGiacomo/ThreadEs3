public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Simboli c1 = new Simboli(20, '@');
        Simboli c2 = new Simboli(30, '+');

        c1.run();
        c2.run();
    }
}
