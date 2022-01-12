public class E12Longitud3 {
    public static boolean cuentaCaracteres(String cadena, int numero) {
        String[] palabras = Utilidades.dividirEnPalabras(cadena);
        for (String palabra : palabras) {
            if (palabra.length() < numero)
                return true;
            else
                return false;
        }
        return false;
    }

    public static void main(String[] args) {
        String cadena = Utilidades.leerCadena("Cadena");
        int numero = Utilidades.leerEntero("Numero de caracteres");
        if (cuentaCaracteres(cadena, numero))
            System.out.println("Todas las cadenas son cortas");
        else
            System.out.println("Hay alguna palabra larga");
    }
}
