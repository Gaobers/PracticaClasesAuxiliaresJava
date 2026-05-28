import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese una frase:");
        String frase = sc.nextLine();

        int ultimaPosicion = frase.lastIndexOf(" ");

        if (ultimaPosicion != -1) {
            String nuevaFrase = frase.substring(0, ultimaPosicion);
            System.out.println("Frase sin la última palabra:");
            System.out.println(nuevaFrase);
        } else {
            System.out.println("La frase solo tiene una palabra.");
        }
    }
}