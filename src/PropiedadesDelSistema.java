import java.util.Properties;

public class PropiedadesDelSistema {
    public static void main(String[] args) {
        String usuario1 = System.getProperty("user.name");
        System.out.println("usuario = " + usuario1);

        String home = System.getProperty("user.home");
        System.out.println("home = " + home);

        String directorio = System.getProperty("user.home");
        System.out.println("directorio = " + directorio);

        Properties p = System.getProperties();
        p.list(System.out);
    }
}
