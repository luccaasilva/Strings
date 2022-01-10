public class LastIndexOf {

    public static void main(String[] args) {
        String cadena1 = Utilidades.leerCadena("Cadena 1");
        String cadena2 = Utilidades.leerCadena("Cadena 2");
        System.out.println("Posicion final: " + cadena1.lastIndexOf(cadena2));
    }
}