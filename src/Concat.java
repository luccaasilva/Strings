public class Concat {
    public static void main(String[] args) {
        String cadena1 = Utilidades.leerCadena("Cadena 1");
        String cadena2 = Utilidades.leerCadena("Cadena 2");
        String cadenaConcat = cadena1.concat(cadena2);
        System.out.println(cadenaConcat);
    }
}