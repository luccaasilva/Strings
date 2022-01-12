import java.sql.SQLOutput;

public class E15Parentesis {
    public static boolean parentesis(String cadena) {
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == '(')
                contador++;
            else if (cadena.charAt(i) == ')')
                contador--;

            if (contador < 0) {
                break;
            }

        }
        if (contador == 0)
            return true;
        return false;
    }

    public static void main(String[] args) {
        String cadena = Utilidades.leerCadena("Cadena");
        if (parentesis(cadena))
            System.out.println("Está bien parentizada");
        else
            System.out.println("No está bien parentizada");
    }
}
