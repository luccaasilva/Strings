public class Ends {
    public static void main(String[] args) {
        String cadena1 = Utilidades.leerCadena("Cadena 1");
        String cadena2 = Utilidades.leerCadena("Cadena 2");
        System.out.println(cadena1.endsWith(cadena2));
    }
}
