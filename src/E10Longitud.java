public class E10Longitud {
    public static int cuentaCaracteres(String cadena, int numero) {
        int contador = 0;
        String[] palabras = Utilidades.dividirEnPalabras(cadena);
        for (String palabra : palabras) {
            if (palabra.length() == numero)
                contador++;
        }

        return contador;
    }

    public static void main(String[] args) {
        String cadena = Utilidades.leerCadena("Cadena");
        int numero = Utilidades.leerEntero("Numero de caracteres");
        System.out.println(cuentaCaracteres(cadena, numero));
    }
}
