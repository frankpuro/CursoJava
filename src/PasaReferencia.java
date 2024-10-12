public class PasaReferencia {
    public static void main(String[] args) {
        int[] edad = {10, 11,12};
        for (int i = 0; i < edad.length; i++ ) {
            System.out.println("edad: " + edad[i]);
        }
        test(edad);
        System.out.println("Ultimo recorrido");
        for (int i = 0; i < edad.length; i++ ) {
            System.out.println("edad: " + edad[i]);
        }
    }

    public static void test(int[] edad) {
        for (int i = 0; i < edad.length; i++ ) {
            edad[i] = edad[i] + 10;
            System.out.println("edad: " + edad[i]);
        }
    }
}
