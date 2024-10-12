class persona {
    private String nombre;

    public void asignaNombre(String nombre2){
        this.nombre = nombre2;
    }

    public String leerNombre(){
        return this.nombre;
    }
}

public class PasaReferencia2 {
    public static void main(String[] args) {

        persona algo = new persona();
        algo.asignaNombre("Frank");
        System.out.println(algo.leerNombre());
        test(algo);
        System.out.println(algo.leerNombre());

    }

    public static void test(persona algo) {
        algo.asignaNombre("Elia");
    }
}
