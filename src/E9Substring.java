public class E9Substring {
    public static void main(String[] args) {
        String cadena = Utilidades.leerCadena("Cadena1");
        int inicio = Utilidades.leerEntero("Posicion inicial");
        System.out.println(cadena.substring(inicio));
    }
}