public class E11Longitud2 {
    public static boolean cuentaCaracteres(String cadena, int numero) {
        String[] palabras = Utilidades.dividirEnPalabras(cadena);
        for (String palabra : palabras) {
            if (palabra.length() == numero)
                return true;
        }

        return false;
    }

    public static void main(String[] args) {
        String cadena = Utilidades.leerCadena("Cadena");
        int numero = Utilidades.leerEntero("Numero de caracteres");
        if(cuentaCaracteres(cadena, numero))
            System.out.println("Una o mas palabras tienen "+numero+" letras");
        else
            System.out.println("Ninguna palabra tiene "+numero+" letras");
    }
}
