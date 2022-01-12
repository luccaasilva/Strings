public class E13Digitos {
    public static int contarDigitos (String cadena){
        int contador =0;
        for (int i = 0 ; i<cadena.length();i++)
            if (Character.isDigit(cadena.charAt(i)))
                contador++;

        return contador;
    }
    public static void main(String[] args) {
        String cadena = Utilidades.leerCadena("Cadena");
        System.out.println("La cadena tien "+contarDigitos(cadena)+" digitos");
    }
}
