import java.net.SocketOption;

public class PasaValor {
    public static void main(String[] args) {
        String Nome = "Frank";
        System.out.println("Hola Mundo, " + Nome);
        test(Nome);
    }

    public static void test(String Nome) {
        System.out.println("Hola Mundo, " + Nome);
        Nome = "Jennifer";
        System.out.println("Finalizo, "+ Nome);
    }
}
