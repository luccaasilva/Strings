public class Reemplazar {
    public static void main(String[] args) {
        String cadena = Utilidades.leerCadena("Cadena");
        char caracter1 = Utilidades.leerCaracter("Caracter a remplazar");
        char caracter2 = Utilidades.leerCaracter("Caracter por el que se reemplaza");
        System.out.println(cadena.replace(caracter1, caracter2));

    }
}
