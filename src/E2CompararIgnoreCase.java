public class E2CompararIgnoreCase {
    public static void main(String[] args) {
        String cadena1 = Utilidades.leerCadena("Cadena 1");
        String cadena2 = Utilidades.leerCadena("Cadena 2");
        if (cadena2.compareToIgnoreCase(cadena1) < 0)
            System.out.println("La primera es mayor que la segunda");
        else if (cadena2.compareToIgnoreCase(cadena1) > 0)
            System.out.println("La segunda es mayor que la primera");
        else
            System.out.println("Son iguales");

    }
}